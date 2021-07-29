package com.yellowgg.behavioraltype_03.strategy_12.strategymodel_17.context;

import com.yellowgg.behavioraltype_03.strategy_12.strategymodel_17.strategy.Strategy;

/**
 * @Description: 使用策略的类
 * @Author: yellowgg
 * @Date: Created in 2021/7/29 21:49
 */
public class Context {
    /**
     * 持有策略
     */
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeDraw(int radius, int x, int y) {
        strategy.draw(radius, x, y);
    }
}
