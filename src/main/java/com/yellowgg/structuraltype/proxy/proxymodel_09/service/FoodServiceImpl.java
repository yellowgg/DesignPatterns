package com.yellowgg.structuraltype.proxy.proxymodel_09.service;

import com.yellowgg.structuraltype.proxy.proxymodel_09.food.Food;
import com.yellowgg.structuraltype.proxy.proxymodel_09.food.HuangMenChicken;
import com.yellowgg.structuraltype.proxy.proxymodel_09.food.LanZhouNoodle;

/**
 * @Description:
 * @Author: yellowgg
 * @Date: Created in 2021/7/21 20:20
 */
public class FoodServiceImpl implements FoodService {
    @Override
    public Food makeChicken() {
        Food f = new HuangMenChicken();
        f.setName("黄氏黄焖鸡");
        return f;
    }

    @Override
    public Food makeNoodle() {
        Food f = new LanZhouNoodle();
        f.setName("黄氏兰州拉面");
        return f;
    }
}
