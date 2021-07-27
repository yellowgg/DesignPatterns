package com.yellowgg.structuraltype_02.decorator_08.decoratormodel_13.condiment;

import com.yellowgg.structuraltype_02.decorator_08.decoratormodel_13.beverage.Beverage;

/**
 * @Description:
 * @Author: yellowgg
 * @Date: Created in 2021/7/27 23:53
 */
public class Mango extends Condiment {
    private Beverage beverage;

    public Mango(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 描述
     *
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 加芒果";
    }

    /**
     * 价格
     *
     * @return
     */
    @Override
    public double cost() {
        return beverage.cost() + 3; // 加芒果需要 3 元
    }
}
