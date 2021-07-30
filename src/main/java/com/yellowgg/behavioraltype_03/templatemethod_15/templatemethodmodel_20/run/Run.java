package com.yellowgg.behavioraltype_03.templatemethod_15.templatemethodmodel_20.run;

import com.yellowgg.behavioraltype_03.templatemethod_15.templatemethodmodel_20.beverage.Coffee;
import com.yellowgg.behavioraltype_03.templatemethod_15.templatemethodmodel_20.beverage.MakeBeverage;
import com.yellowgg.behavioraltype_03.templatemethod_15.templatemethodmodel_20.beverage.Tea;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/7/30 14:14
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("咖啡制备中。。。");
        MakeBeverage coffee = new Coffee();
        coffee.prepreBvergeTemplage();
        System.out.println("咖啡制备完成！ ");

        System.out.println("*********************");


        System.out.println("茶制备中。。。");
        MakeBeverage tea = new Tea();
        tea.prepreBvergeTemplage();
        System.out.println("茶制备完成！");
    }
}
