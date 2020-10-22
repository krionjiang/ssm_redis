package com.jlq.service.impl;

import com.jlq.dao.IGoodsDao;
import com.jlq.domain.GoodsInfo;
import com.jlq.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/22 20:34
 */

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private IGoodsDao goodsDao;

    public List<GoodsInfo> findAll() {
        return goodsDao.selectAll();
    }
}


