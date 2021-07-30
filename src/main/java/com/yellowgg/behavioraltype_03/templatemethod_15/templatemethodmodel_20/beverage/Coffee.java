package com.yellowgg.behavioraltype_03.templatemethod_15.templatemethodmodel_20.beverage;

/**
 * @Description: 制作咖啡
 * @Author: yellowgg
 * @Date: Created in 2021/7/30 14:13
 */
public class Coffee extends MakeBeverage {

    /**
     * 泡制饮料
     */
    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    /**
     * 加入调味料
     */
    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }
}
