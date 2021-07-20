package com.yellowgg.creativetype.factory.simplefactorymodel_01.factory;

import com.yellowgg.creativetype.factory.simplefactorymodel_01.food.LanZhouNoodle;
import com.yellowgg.creativetype.factory.simplefactorymodel_01.food.Food;
import com.yellowgg.creativetype.factory.simplefactorymodel_01.food.HuangMenChicken;
import lombok.Data;

/**
 * @Description: 食物简单工厂
 * @Author: yellowgg
 * @Date: Created in 2021/6/22 16:27
 */
@Data
public class FoodFactory {

    public static Food makeFood(String name) {
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
