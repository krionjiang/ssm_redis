package com.jlq.controller;

import com.jlq.domain.GoodsInfo;
import com.jlq.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/22 21:50
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private IGoodsService gs;

    @RequestMapping("/list")
    public String FindAll(){

        List<GoodsInfo> goodsInfos = gs.findAll();

        for (GoodsInfo goods:
             goodsInfos) {
            System.out.println(goods);
        }
        return "success";
    }

}


