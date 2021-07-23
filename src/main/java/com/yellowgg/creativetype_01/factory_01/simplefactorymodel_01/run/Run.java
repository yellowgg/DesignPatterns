package com.yellowgg.creativetype_01.factory_01.simplefactorymodel_01.run;

import com.yellowgg.creativetype_01.factory_01.simplefactorymodel_01.factory.FoodFactory;
import com.yellowgg.creativetype_01.factory_01.simplefactorymodel_01.food.Food;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/6/22 16:33
 */
public class Run {
    public static void main(String[] args) {
        Food noodle = FoodFactory.makeFood("noodle");
        System.out.println(noodle);
        Food chicken = FoodFactory.makeFood("chicken");
        System.out.println(chicken);
    }
}
