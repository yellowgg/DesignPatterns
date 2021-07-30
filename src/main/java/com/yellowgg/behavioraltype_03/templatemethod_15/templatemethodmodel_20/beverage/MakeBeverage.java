package com.yellowgg.behavioraltype_03.templatemethod_15.templatemethodmodel_20.beverage;

/**
 * @Description: 饮料
 * 定义抽象基类，为所有子类提供一个算法框架
 * @Author: yellowgg
 * @Date: Created in 2021/7/30 14:09
 */
public abstract class MakeBeverage {

    /**
     * 制备饮料的模板方法
     * 封装了所有子类共同遵守的算法骨架
     */
    public final void prepreBvergeTemplage() {
        //步骤一 将水煮沸
        boilWater();
        //步骤二 炮制饮料
        brew();
        //步骤三 将饮料倒入杯中
        pourInCup();

        // //步骤四 加入调味料
        // addCondiments();

        // 扩展，使用钩子
        if (isCustomWantsCondments()) {
            addCondiments();
        }
    }

    /**
     * 基本方法，将水煮沸 这对所有子类而言是一个共同的行为，所以声明为private,无需向子类开放
     */
    private void boilWater() {
        System.out.println("将水煮沸");
    }

    /**
     * 抽象的基本方法 泡制饮料
     * 在算法框架中并不知道具体实现是什么样子的，所以做成了抽象方法，并且由于我们需要在子类中可见，便于复写而提供具体的实现所以将权限设置为protected
     */
    protected abstract void brew();

    /**
     * 基本方法， 导入杯中，这对所有子类而言是一个共同的行为，所以声明为private,无需向子类开放
     */
    private void pourInCup() {
        System.out.println("将饮料倒入杯中");
    }

    /**
     * 抽象的基本方法 加入调味料
     * 在算法框架中并不知道具体实现是什么样子的，所以做成了抽象方法，并且由于我们需要在子类中可见，便于复写而提供具体的实现所以将权限设置为protected
     */
    protected abstract void addCondiments();

    /**
     * Hook 钩子函数，提供一个默认或空的实现
     * 具体的子类可以自行决定是否挂钩以及如何挂钩
     * 是否加入调料
     *
     * @return
     */
    protected boolean isCustomWantsCondments() {
        return true;
    }
}
