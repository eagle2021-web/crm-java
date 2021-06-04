package com.itbull.crm.handler;

import com.itbull.crm.service.impl.GoodsServiceImpl;
import com.itbull.crm.service.impl.MyUtilImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Set;

@CrossOrigin(value = {"http://localhost:3000","http://localhost:8083"})
@Controller
@RequestMapping(value = "/user")
public class UserLogin {
    @Resource
    private GoodsServiceImpl goodsServiceImpl;
    @Resource
    private MyUtilImpl myUtilImpl;

    @RequestMapping(value = "/getJson")
    //指定放回的数据格式json,靠注解@ResponseBody
    @ResponseBody
    public String testGetJson(HttpServletResponse response, HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<Map.Entry<String, String[]>> entries = parameterMap.entrySet();
        System.out.println("==============");
        for (Map.Entry<String, String[]> entry : entries) {
            String key = entry.getKey();
            System.out.println("key  " + key);
            if("password".equals(key)){
                myUtilImpl.handleMd5(entry.getValue()[0]);
            }
        }
        System.out.println("==============");
        String originalURL = request.getHeader("Origin");
        System.out.println("请求源" + originalURL);
        response.addHeader("Access-Control-Allow-Credentials", "true");
        return "goodsList;";
    }
}
