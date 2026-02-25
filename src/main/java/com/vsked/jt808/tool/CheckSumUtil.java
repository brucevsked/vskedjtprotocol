package com.vsked.jt808.tool;

public class CheckSumUtil {

    /**
     * 计算校验码（从消息头开始到消息体结束，按位异或）
     */
    public static byte calculate(byte[] data) {
        byte checkSum = 0;
        for (byte b : data) {
            checkSum ^= b;
        }
        return checkSum;
    }

    /**
     * 验证校验码
     */
    public static boolean verify(byte[] data, byte checkSum) {
        return calculate(data) == checkSum;
    }
}
