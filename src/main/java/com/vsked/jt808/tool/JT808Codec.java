package com.vsked.jt808.tool;

import com.vsked.jt808.JT808Message;
import com.vsked.jt808.MessageHeader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class JT808Codec {
    private static final byte FLAG = 0x7E;  // 标识位

    /**
     * 编码：将JT808Message编码为字节数组
     */
    public static byte[] encode(JT808Message message) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // 1. 构建消息头
        byte[] header = buildHeader(message.getMsgHeader());

        // 2. 获取消息体
        byte[] body = message.getMsgBody();

        // 3. 计算校验码（消息头+消息体）
        ByteArrayOutputStream checkData = new ByteArrayOutputStream();
        try {
            checkData.write(header);
            if (body != null) {
                checkData.write(body);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte checkSum = CheckSumUtil.calculate(checkData.toByteArray());

        // 4. 组装完整消息（不含标识位）
        ByteArrayOutputStream fullMessage = new ByteArrayOutputStream();
        try {
            fullMessage.write(header);
            if (body != null) {
                fullMessage.write(body);
            }
            fullMessage.write(checkSum);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 5. 转义处理
        byte[] escapedData = EscapeUtil.escape(fullMessage.toByteArray());

        // 6. 添加标识位
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        try {
            result.write(FLAG);
            result.write(escapedData);
            result.write(FLAG);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toByteArray();
    }

    /**
     * 解码：将字节数组解码为JT808Message
     */
    public static JT808Message decode(byte[] data) {
        // 1. 去除标识位
        int start = 0;
        int end = data.length;
        if (data[0] == FLAG) start = 1;
        if (data[data.length - 1] == FLAG) end = data.length - 1;

        byte[] trimmedData = Arrays.copyOfRange(data, start, end);

        // 2. 反转义
        byte[] unescapedData = EscapeUtil.unescape(trimmedData);

        // 3. 分离消息头、消息体、校验码
        // 消息头固定12字节（或根据协议版本可能不同）
        int headerLength = 12;
        byte[] headerBytes = Arrays.copyOfRange(unescapedData, 0, headerLength);

        // 最后1字节是校验码
        byte checkSum = unescapedData[unescapedData.length - 1];

        // 中间部分是消息体
        byte[] bodyBytes = Arrays.copyOfRange(unescapedData, headerLength,
                unescapedData.length - 1);

        // 4. 验证校验码
        byte[] checkData = Arrays.copyOfRange(unescapedData, 0,
                unescapedData.length - 1);
        if (!CheckSumUtil.verify(checkData, checkSum)) {
            throw new RuntimeException("校验码验证失败");
        }

        // 5. 解析消息头
        MessageHeader header = parseHeader(headerBytes);

        // 6. 构建消息对象
        JT808Message message = new JT808Message();
        message.setMsgHeader(header);
        message.setMsgBody(bodyBytes);
        message.setCheckSum(checkSum);

        return message;
    }

    private static byte[] buildHeader(MessageHeader header) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        try {
            dos.writeShort(header.getMsgId());
            dos.writeShort(header.getMsgBodyProps());
            dos.write(BCDUtil.stringToBCD(header.getTerminalPhone()));
            dos.writeShort(header.getMsgSeq());
            if (header.getMsgTotalPackets() > 0) {
                dos.writeShort(header.getMsgTotalPackets());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return baos.toByteArray();
    }

    private static MessageHeader parseHeader(byte[] data) {
        MessageHeader header = new MessageHeader();
        ByteBuffer buffer = ByteBuffer.wrap(data);
        header.setMsgId(buffer.getShort() & 0xFFFF);
        header.setMsgBodyProps(buffer.getShort() & 0xFFFF);

        byte[] phoneBytes = new byte[6];
        buffer.get(phoneBytes);
        header.setTerminalPhone(BCDUtil.bcdToString(phoneBytes));

        header.setMsgSeq(buffer.getShort() & 0xFFFF);

        if (data.length > 12) {
            header.setMsgTotalPackets(buffer.getShort() & 0xFFFF);
        }

        return header;
    }
}
