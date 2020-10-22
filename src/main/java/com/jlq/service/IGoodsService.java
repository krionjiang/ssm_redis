package com.jlq.service;

import com.jlq.domain.GoodsInfo;

import java.util.List;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/22 20:33
 */

public interface IGoodsService {

    /**
     * 查询所有商品信息
     * @return
     */
    List<GoodsInfo> findAll();
}


