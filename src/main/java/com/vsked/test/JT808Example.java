package com.vsked.test;

import com.vsked.jt808.JT808Message;
import com.vsked.jt808.MessageHeader;
import com.vsked.jt808.tool.JT808Codec;

public class JT808Example {
    public static void main(String[] args) {
        // 创建消息
        JT808Message message = new JT808Message();

        MessageHeader header = new MessageHeader();
        header.setMsgId(0x0200);  // 位置信息上报
        header.setMsgBodyProps(0x0000);  // 消息体属性
        header.setTerminalPhone("13800138000");
        header.setMsgSeq(1);

        message.setMsgHeader(header);
        message.setMsgBody(new byte[]{0x01, 0x02, 0x03});

        // 编码
        byte[] encoded = JT808Codec.encode(message);
        System.out.println("编码后：" + bytesToHex(encoded));

        // 解码
        JT808Message decoded = JT808Codec.decode(encoded);
        System.out.println("消息ID: 0x" + Integer.toHexString(decoded.getMsgHeader().getMsgId()));
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X ", b));
        }
        return sb.toString();
    }
}
