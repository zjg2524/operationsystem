package com.flnet.operationsystem.utils;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @description: md5加密
 * @author: zhangjingui
 * @create: 2018-11-16 14:28
 **/

public class MD5utils {

    private static String encrypt(String src,String salt,int saltNum)
    {
        return new SimpleHash("MD5",src,salt,saltNum).toBase64();
    }
}

