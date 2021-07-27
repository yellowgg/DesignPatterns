package com.yellowgg.structuraltype_02.decorator_08.decoratormodel_13.beverage;

/**
 * @Description: 饮料抽象类
 * @Author: yellowgg
 * @Date: Created in 2021/7/27 22:40
 */
public abstract class Beverage {

    /**
     * 描述
     *
     * @return
     */
    public abstract String getDescription();

    /**
     * 价格
     *
     * @return
     */
    public abstract double cost();
}
