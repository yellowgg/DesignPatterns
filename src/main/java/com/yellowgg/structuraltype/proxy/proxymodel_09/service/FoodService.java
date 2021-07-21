package com.yellowgg.structuraltype.proxy.proxymodel_09.service;

import com.yellowgg.structuraltype.proxy.proxymodel_09.food.Food;

/**
 * @Description: 食物抽象接口
 * @Author: yellowgg
 * @Date: Created in 2021/7/21 20:19
 */
public interface FoodService {
    Food makeChicken();

    Food makeNoodle();
}
