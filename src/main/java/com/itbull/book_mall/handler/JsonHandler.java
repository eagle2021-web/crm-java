package com.itbull.book_mall.handler;

import com.itbull.book_mall.entity.Goods;
import com.itbull.book_mall.service.impl.GoodsServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@CrossOrigin(value = {"http://localhost:3000","http://localhost:8083"})
@Controller
@RequestMapping(value = "/json")
public class JsonHandler {
    @Resource
    private GoodsServiceImpl goodsServiceImpl;

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
        System.out.println(request.getCookies());
        System.out.println(13333);
//        Goods goods = goodsServiceImpl.selectByPrimaryKey(1);
        List<Goods> goodsList = goodsServiceImpl.selectAll();
//        System.out.println(goods);
        response.setCharacterEncoding("UTF-8");//设置编码格式
        String originalURL = request.getHeader("Origin");
        System.out.println("请求源" + originalURL);
        response.addHeader("Access-Control-Allow-Credentials", "true");
        System.out.println(3333);
        return goodsList;
    }
}
