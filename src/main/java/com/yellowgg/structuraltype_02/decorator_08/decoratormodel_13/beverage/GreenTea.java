package com.yellowgg.structuraltype_02.decorator_08.decoratormodel_13.beverage;

/**
 * @Description: 绿茶
 * @Author: yellowgg
 * @Date: Created in 2021/7/27 22:42
 */
public class GreenTea extends Beverage {
    /**
     * 描述
     *
     * @return
     */
    @Override
    public String getDescription() {
        return "绿茶";
    }

    /**
     * 价格
     *
     * @return
     */
    @Override
    public double cost() {
        return 12;
    }
}
