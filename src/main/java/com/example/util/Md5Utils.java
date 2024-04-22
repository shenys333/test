package com.example.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * @ClassName Md5Utils
 * @Description TODO
 * @Author 申延胜
 * @DATE 2024/4/19 9:58
 **/
public class Md5Utils {

    public static String encryptToMd5(String str) {
        return org.apache.commons.codec.digest.DigestUtils.md5Hex(str);
    }

    /**
     * java加密
     */
    public static String encrypt2ToMd5(String str) {

        // 加密后的16进制字符串
        String hexStr = "";
        try {

            // 此 MessageDigest 类为应用程序提供信息摘要算法的功能
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            // 转换为MD5码
            byte[] digest = md5.digest(str.getBytes(StandardCharsets.UTF_8));
            hexStr = ByteUtils.toHexString(digest);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return hexStr;
    }

    /**
     * org.springframework.util.DigestUtils
     */
    public static String encrypt3ToMd5(String str) {
        return org.springframework.util.DigestUtils.md5DigestAsHex(str.getBytes(StandardCharsets.UTF_8));
    }
}
