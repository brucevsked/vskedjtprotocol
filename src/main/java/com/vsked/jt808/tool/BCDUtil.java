package com.vsked.jt808.tool;

public class BCDUtil {

    /**
     * 字符串转BCD编码
     */
    public static byte[] stringToBCD(String str) {
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }

        // 补齐奇数位
        if (str.length() % 2 != 0) {
            str = "0" + str;
        }

        byte[] bcd = new byte[str.length() / 2];
        for (int i = 0; i < str.length(); i += 2) {
            int high = Character.digit(str.charAt(i), 10);
            int low = Character.digit(str.charAt(i + 1), 10);
            bcd[i / 2] = (byte) ((high << 4) | low);
        }
        return bcd;
    }

    /**
     * BCD编码转字符串
     */
    public static String bcdToString(byte[] bcd) {
        if (bcd == null || bcd.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (byte b : bcd) {
            int high = (b >> 4) & 0x0F;
            int low = b & 0x0F;
            sb.append(high).append(low);
        }
        return sb.toString();
    }
}
