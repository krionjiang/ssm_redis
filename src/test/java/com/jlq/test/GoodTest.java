package com.jlq.test;

import com.jlq.domain.GoodsInfo;
import com.jlq.service.IGoodsService;
import com.jlq.tools.JSONChange;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/22 20:36
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-dao.xml")
public class GoodTest {

    @Autowired
    private IGoodsService gs;

    @Test
    public void testFindAll() {
        System.out.println(gs);
        List<GoodsInfo> goodsInfos = gs.findAll();
        String s = JSONChange.objToJson(goodsInfos);
        System.out.println(s);
        for (GoodsInfo good:goodsInfos
             ) {
            System.out.println(good);
        }

    }
}


