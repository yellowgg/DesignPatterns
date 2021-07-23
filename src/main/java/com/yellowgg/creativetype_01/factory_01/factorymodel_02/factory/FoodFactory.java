package com.yellowgg.creativetype_01.factory_01.factorymodel_02.factory;

import com.yellowgg.creativetype_01.factory_01.factorymodel_02.food.Food;

/**
 * @Description: 食物工厂接口
 * @Author: yellowgg
 * @Date: Created in 2021/6/23 15:23
 */
public interface FoodFactory {
    Food makeFood(String name);
}
