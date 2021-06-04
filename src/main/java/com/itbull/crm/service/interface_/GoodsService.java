package com.itbull.crm.service.interface_;

import com.itbull.crm.entity.Goods;

import java.util.List;

public interface GoodsService {
    Goods selectByPrimaryKey(Integer id);
    List<Goods> selectAll();
}
