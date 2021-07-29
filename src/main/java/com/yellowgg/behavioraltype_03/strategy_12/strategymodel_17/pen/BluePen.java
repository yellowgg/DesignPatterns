package com.yellowgg.behavioraltype_03.strategy_12.strategymodel_17.pen;

import com.yellowgg.behavioraltype_03.strategy_12.strategymodel_17.strategy.Strategy;

/**
 * @Description: 蓝笔
 * @Author: yellowgg
 * @Date: Created in 2021/7/29 21:46
 */
public class BluePen implements Strategy {

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用蓝色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
