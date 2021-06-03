package com.itbull.book_mall.service.interface_;

import com.itbull.book_mall.entity.Goods;

import java.util.List;

public interface GoodsService {
    Goods selectByPrimaryKey(Integer id);
    List<Goods> selectAll();
}
