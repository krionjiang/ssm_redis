package com.jlq.controller;

import com.jlq.domain.GoodsInfo;
import com.jlq.service.IGoodsService;
import com.jlq.tools.JSONChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/22 21:50
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private IGoodsService gs;

    @RequestMapping(value = "/hhh")
    @ResponseBody
    public  List<GoodsInfo> FindAll(){

        List<GoodsInfo> goodsInfos = gs.findAll();

        for (GoodsInfo goods:
             goodsInfos) {
            System.out.println(goods);
        }
        String s = JSONChange.objToJson(goodsInfos);
        System.out.println("json:"+s);
        return goodsInfos;
    }

    @RequestMapping("/layout")
    @ResponseBody
    public Object FindAll02(){

        List<GoodsInfo> goodsInfos = gs.findAll();

        Map<String,Object> map = new HashMap<String,Object>();

        map.put("code",0);
//        map.put("msg","");
//        map.put("count",1000);
        map.put("data",goodsInfos);
        return map;
    }

}


