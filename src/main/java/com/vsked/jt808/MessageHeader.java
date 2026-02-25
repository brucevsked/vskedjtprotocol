package com.vsked.jt808;

public class MessageHeader {
    private int msgId;              // 消息ID，2字节
    private int msgBodyProps;       // 消息体属性，2字节
    private String terminalPhone;   // 终端手机号，6字节BCD编码
    private int msgSeq;             // 消息流水号，2字节
    private int msgTotalPackets;    // 消息包总项数（分包时），2字节

    // 从消息体属性中解析的字段
    private int msgBodyLength;      // 消息体长度，10位
    private int encryptionType;     // 加密方式，2位
    private int hasSubPackage;      // 是否分包，1位

    public int getMsgId() { return msgId; }
    public void setMsgId(int msgId) { this.msgId = msgId; }

    public int getMsgBodyProps() { return msgBodyProps; }
    public void setMsgBodyProps(int msgBodyProps) {
        this.msgBodyProps = msgBodyProps;
        parseMsgBodyProps();
    }

    private void parseMsgBodyProps() {
        this.msgBodyLength = msgBodyProps & 0x03FF;  // 低10位
        this.encryptionType = (msgBodyProps >> 10) & 0x03;  // 第11-12位
        this.hasSubPackage = (msgBodyProps >> 12) & 0x01;   // 第13位
    }

    public String getTerminalPhone() {
        return terminalPhone;
    }

    public void setTerminalPhone(String terminalPhone) {
        this.terminalPhone = terminalPhone;
    }

    public int getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(int msgSeq) {
        this.msgSeq = msgSeq;
    }

    public int getMsgTotalPackets() {
        return msgTotalPackets;
    }

    public void setMsgTotalPackets(int msgTotalPackets) {
        this.msgTotalPackets = msgTotalPackets;
    }

    public int getMsgBodyLength() {
        return msgBodyLength;
    }

    public void setMsgBodyLength(int msgBodyLength) {
        this.msgBodyLength = msgBodyLength;
    }

    public int getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(int encryptionType) {
        this.encryptionType = encryptionType;
    }

    public int getHasSubPackage() {
        return hasSubPackage;
    }

    public void setHasSubPackage(int hasSubPackage) {
        this.hasSubPackage = hasSubPackage;
    }
}
