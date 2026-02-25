package com.vsked.jt808;

public class JT808Message {
    private MessageHeader msgHeader;    // 消息头
    private byte[] msgBody;             // 消息体
    private byte checkSum;              // 校验码

    public MessageHeader getMsgHeader() { return msgHeader; }
    public void setMsgHeader(MessageHeader msgHeader) { this.msgHeader = msgHeader; }

    public byte[] getMsgBody() { return msgBody; }
    public void setMsgBody(byte[] msgBody) { this.msgBody = msgBody; }

    public byte getCheckSum() { return checkSum; }
    public void setCheckSum(byte checkSum) { this.checkSum = checkSum; }
}
