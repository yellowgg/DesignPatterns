package com.yellowgg.structuraltype.proxy.proxymodel_09.run;

import com.yellowgg.structuraltype.proxy.proxymodel_09.food.Food;
import com.yellowgg.structuraltype.proxy.proxymodel_09.service.FoodService;
import com.yellowgg.structuraltype.proxy.proxymodel_09.service.FoodServiceProxy;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/7/21 20:25
 */
public class Run {
    public static void main(String[] args) {
        // 这里用代理类来实例化
        FoodService foodService = new FoodServiceProxy();
        Food food = foodService.makeChicken();
        System.out.println(food);
    }
}
