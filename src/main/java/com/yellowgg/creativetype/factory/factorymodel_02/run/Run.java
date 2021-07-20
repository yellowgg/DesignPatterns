package com.yellowgg.creativetype.factory.factorymodel_02.run;

import com.yellowgg.creativetype.factory.factorymodel_02.factory.AmericanFoodFactory;
import com.yellowgg.creativetype.factory.factorymodel_02.factory.ChineseFoodFactory;
import com.yellowgg.creativetype.factory.factorymodel_02.factory.FoodFactory;
import com.yellowgg.creativetype.factory.factorymodel_02.food.Food;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/6/22 16:33
 */
public class Run {
    public static void main(String[] args) {
        FoodFactory chineseFoodFactory = new ChineseFoodFactory();
        Food chineseChicken = chineseFoodFactory.makeFood("chicken");
        System.out.println(chineseChicken);

        FoodFactory americanFoodFactory = new AmericanFoodFactory();
        Food americanChicken = americanFoodFactory.makeFood("chicken");
        System.out.println(americanChicken);
    }
}
