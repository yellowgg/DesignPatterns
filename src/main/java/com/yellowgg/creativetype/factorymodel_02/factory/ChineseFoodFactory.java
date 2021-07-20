package com.yellowgg.creativetype.factorymodel_02.factory;

import com.yellowgg.creativetype.factorymodel_02.food.Food;
import com.yellowgg.creativetype.factorymodel_02.food.HuangMenChicken;
import com.yellowgg.creativetype.factorymodel_02.food.LanZhouNoodle;

/**
 * @Description: 中国食物工厂
 * @Author: yellowgg
 * @Date: Created in 2021/6/23 15:26
 */
public class ChineseFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if (name.equals("noodle")) {
            LanZhouNoodle noodle = new LanZhouNoodle();
            noodle.setName("好吃的兰州拉面");
            noodle.setSpicy(10);
            return noodle;
        } else if (name.equals("chicken")) {
            HuangMenChicken chicken = new HuangMenChicken();
            chicken.setName("有家黄焖鸡面");
            chicken.setCondiment("马铃薯");
            return chicken;
        } else {
            return null;
        }
    }
}
