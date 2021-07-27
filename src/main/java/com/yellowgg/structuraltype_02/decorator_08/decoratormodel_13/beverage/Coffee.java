package com.yellowgg.structuraltype_02.decorator_08.decoratormodel_13.beverage;

/**
 * @Description: 咖啡
 * @Author: yellowgg
 * @Date: Created in 2021/7/27 22:43
 */
public class Coffee extends Beverage {
    /**
     * 描述
     *
     * @return
     */
    @Override
    public String getDescription() {
        return "咖啡";
    }

    /**
     * 价格
     *
     * @return
     */
    @Override
    public double cost() {
        return 13;
    }
}
