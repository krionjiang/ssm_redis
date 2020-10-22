package com.jlq.test;

import com.jlq.domain.GoodsInfo;
import com.jlq.service.IGoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/22 20:36
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/springConfig.xml","classpath:spring/applicationContext-dao.xml"})
public class GoodTest {

    @Autowired
    private IGoodsService gs;

    @Test
    public void testFindAll() {
        System.out.println(gs);
        List<GoodsInfo> goodsInfos = gs.findAll();
        for (GoodsInfo good:goodsInfos
             ) {
            System.out.println(good);
        }

    }
}

