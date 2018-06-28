package com.tools.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created with IntelliJ IDEA
 * ProjectName: ssm-maven
 * CreateUser:  lixiaopeng
 * CreateTime : 2018/6/26 18:37
 * ModifyUser: bjlixiaopeng
 * Class Description: 加密工具类
 * To change this template use File | Settings | File and Code Template
 */


public class EncryptUtils {

    public static final Logger logger = LoggerFactory.getLogger(EncryptUtils.class);

    private static final String ALGORITHM_MD5 = "MD5";

    private static final String UTF_8 = "UTF-8";

    public static String MD5_32bit(String str){
        if (StringUtils.isEmpty(str)){
            return "";
        }
        StringBuilder encryptedStr = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance(ALGORITHM_MD5);
            md.update(str.getBytes());
            byte[] bytes = md.digest();
            for(int offset = 0,bLen = bytes.length; offset < bLen; offset++){
                String haxHex = Integer.toHexString(bytes[offset] & 0xFF);
                if(haxHex.length() < 2){
                    encryptedStr.append("0");
                }
                encryptedStr.append(haxHex);
            }
        } catch (NoSuchAlgorithmException e) {
            logger.error("Not found MD5 algorithm !");
        }
        return String.valueOf(encryptedStr);
    }

    /**
     *
     * @param encryptStr
     * @return
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static final String MD5_64bit(String encryptStr){
        if (StringUtils.isEmpty(encryptStr)) {
            return "";
        }
        MessageDigest md;
        BASE64Encoder base64Encoder;
        try {
            md = MessageDigest.getInstance(ALGORITHM_MD5);
            base64Encoder = new BASE64Encoder();
            return base64Encoder.encode(md.digest(encryptStr.getBytes(UTF_8)));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

}
