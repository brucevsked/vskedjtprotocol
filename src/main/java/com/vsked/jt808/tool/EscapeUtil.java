package com.vsked.jt808.tool;

import java.io.ByteArrayOutputStream;

public class EscapeUtil {

    /**
     * 转义处理（发送消息时使用）
     * 0x7e -> 0x7d 0x02
     * 0x7d -> 0x7d 0x01
     */
    public static byte[] escape(byte[] data) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for (byte b : data) {
            if (b == 0x7E) {
                baos.write(0x7D);
                baos.write(0x02);
            } else if (b == 0x7D) {
                baos.write(0x7D);
                baos.write(0x01);
            } else {
                baos.write(b);
            }
        }
        return baos.toByteArray();
    }

    /**
     * 反转义处理（接收消息时使用）
     * 0x7d 0x02 -> 0x7e
     * 0x7d 0x01 -> 0x7d
     */
    public static byte[] unescape(byte[] data) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0x7D && i + 1 < data.length) {
                if (data[i + 1] == 0x02) {
                    baos.write(0x7E);
                    i++;
                } else if (data[i + 1] == 0x01) {
                    baos.write(0x7D);
                    i++;
                } else {
                    baos.write(data[i]);
                }
            } else {
                baos.write(data[i]);
            }
        }
        return baos.toByteArray();
    }
}
