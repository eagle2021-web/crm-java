package com.itbull.crm.service.impl;

import com.itbull.crm.dao.GoodsMapper;
import com.itbull.crm.entity.Goods;
import com.itbull.crm.service.interface_.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public Goods selectByPrimaryKey(Integer id) {
        Goods goods = goodsMapper.selectByPrimaryKey(id);
        return goods;
    }

    @Override
    public List<Goods> selectAll() {
        List<Goods> goods = goodsMapper.selectAll();
        return goods;
    }

    public GoodsMapper getGoodsMapper() {
        return goodsMapper;
    }

    public void setGoodsMapper(GoodsMapper goodsMapper) {
        this.goodsMapper = goodsMapper;
    }
}
