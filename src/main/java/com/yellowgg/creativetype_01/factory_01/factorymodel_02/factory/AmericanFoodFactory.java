package com.yellowgg.creativetype_01.factory_01.factorymodel_02.factory;

import com.yellowgg.creativetype_01.factory_01.factorymodel_02.food.Food;
import com.yellowgg.creativetype_01.factory_01.factorymodel_02.food.Hamburger;
import com.yellowgg.creativetype_01.factory_01.factorymodel_02.food.RoastTurkey;

/**
 * @Description: 美国食物工厂
 * @Author: yellowgg
 * @Date: Created in 2021/6/23 15:34
 */
public class AmericanFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if (name.equals("hanbao")) {
            Hamburger hanbao = new Hamburger();
            hanbao.setName("汉堡王汉堡真难吃");
            hanbao.setKetchup(false);
            return hanbao;
        } else if (name.equals("chicken")) {
            RoastTurkey huoji = new RoastTurkey();
            huoji.setName("感恩节烤火鸡");
            huoji.setDegreeOfCooked(8);
            return huoji;
        } else {
            return null;
        }
    }
}
