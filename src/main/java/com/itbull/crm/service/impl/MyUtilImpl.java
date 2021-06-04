package com.itbull.crm.service.impl;

import com.itbull.crm.service.interface_.MyUtil;
import org.springframework.stereotype.Service;

@Service
public class MyUtilImpl implements MyUtil {
    @Override
    public String handleMd5(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String substring = stringBuilder.reverse().substring(4, str.length() - 4);
        return substring;
    }
}
