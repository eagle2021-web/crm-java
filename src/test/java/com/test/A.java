package com.test;

import org.apache.commons.codec.digest.DigestUtils;

public class A {
    public static void main(String[] args) {
        String s = DigestUtils.md5Hex("123456");
        //8376ac810bb9f231d28fcf1f
        System.out.println(s);
    }
}
