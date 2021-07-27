package com.yellowgg.structuraltype_02.decorator_08.decoratormodel_13.condiment;

import com.yellowgg.structuraltype_02.decorator_08.decoratormodel_13.beverage.Beverage;

/**
 * @Description:
 * @Author: yellowgg
 * @Date: Created in 2021/7/27 22:45
 */
public class Lemon extends Condiment {

    /**
     * 这里很关键，需要传入具体的饮料，如需要传入没有被装饰的红茶或绿茶，
     */
    private Beverage beverage;

    public Lemon(Beverage bevarage) {
        this.beverage = bevarage;
    }

    /**
     * 描述
     *
     * @return
     */
    @Override
    public String getDescription() {
        // 装饰
        return beverage.getDescription() + ", 加柠檬";
    }

    /**
     * 价格
     *
     * @return
     */
    @Override
    public double cost() {
        // 装饰
        return beverage.cost() + 2; // 加柠檬需要 2 元
    }
}
