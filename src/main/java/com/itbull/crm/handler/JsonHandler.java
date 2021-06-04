package com.itbull.crm.handler;

import com.itbull.crm.entity.Goods;
import com.itbull.crm.service.impl.GoodsServiceImpl;
import com.itbull.crm.service.impl.MyUtilImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;

@CrossOrigin(value = {"http://localhost:3000","http://localhost:8083"})
@Controller
@RequestMapping(value = "/json")
public class JsonHandler {
    @Resource
    private GoodsServiceImpl goodsServiceImpl;
    @Resource
    private MyUtilImpl myUtilImpl;
//    @RequestMapping(value = "/getJson")
//    //指定放回的数据格式json,靠注解@ResponseBody
//    @ResponseBody
//    public Goods testGetJson(){
//        Goods goods = goodsServiceImpl.selectByPrimaryKey(1);
//        goodsServiceImpl.selectAll();
//        System.out.println(goods);
//        return goods;
//    }

    @RequestMapping(value = "/getJson")
    //指定放回的数据格式json,靠注解@ResponseBody
    @ResponseBody
    public List<Goods> testGetJson(HttpServletResponse response, HttpServletRequest request) {
        System.out.println(request.getHeader("origin"));
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
        List<Goods> goodsList = goodsServiceImpl.selectAll();
        response.setCharacterEncoding("UTF-8");//设置编码格式
        String originalURL = request.getHeader("Origin");
        System.out.println("请求源" + originalURL);
        response.addHeader("Access-Control-Allow-Credentials", "true");
        System.out.println(3333);
        return goodsList;
    }
}
