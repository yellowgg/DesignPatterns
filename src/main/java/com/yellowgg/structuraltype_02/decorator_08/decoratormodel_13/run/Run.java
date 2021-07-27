package com.yellowgg.structuraltype_02.decorator_08.decoratormodel_13.run;

import com.yellowgg.structuraltype_02.decorator_08.decoratormodel_13.beverage.Beverage;
import com.yellowgg.structuraltype_02.decorator_08.decoratormodel_13.beverage.GreenTea;
import com.yellowgg.structuraltype_02.decorator_08.decoratormodel_13.beverage.RedTea;
import com.yellowgg.structuraltype_02.decorator_08.decoratormodel_13.condiment.Lemon;
import com.yellowgg.structuraltype_02.decorator_08.decoratormodel_13.condiment.Mango;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/7/27 23:54
 */
public class Run {
    public static void main(String[] args) {
        // 首先，我们需要一个基础饮料，红茶、绿茶或咖啡
        Beverage beverage = new GreenTea();
        // 开始装饰
        beverage = new Lemon(beverage); // 先加一份柠檬
        beverage = new Mango(beverage); // 再加一份芒果

        System.out.println(beverage.getDescription() + " 价格：￥" + beverage.cost());
        //"绿茶, 加柠檬, 加芒果 价格：￥17.0"


        // 巨无霸套餐  芒果-珍珠-双份柠檬-红茶
        Beverage bigBeverage = new Mango(new Lemon(new Lemon(new RedTea())));
        System.out.println(bigBeverage.getDescription() + " 价格：￥" + bigBeverage.cost());

    }
}
