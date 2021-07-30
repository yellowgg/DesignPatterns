package com.yellowgg.behavioraltype_03.templatemethod_15.templatemethodmodel_20.beverage;

/**
 * @Description: 泡茶
 * @Author: yellowgg
 * @Date: Created in 2021/7/30 14:13
 */
public class Tea extends MakeBeverage {
    /**
     * 泡制饮料
     */
    @Override
    protected void brew() {
        System.out.println("用80 度的热水浸泡茶叶5分钟");
    }

    /**
     * 加入调味料
     */
    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    /**
     * 茶不需要调料
     *
     * @return
     */
    @Override
    protected boolean isCustomWantsCondments() {
        return false;
    }
}
