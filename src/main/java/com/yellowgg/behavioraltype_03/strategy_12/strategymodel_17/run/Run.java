package com.yellowgg.behavioraltype_03.strategy_12.strategymodel_17.run;

import com.yellowgg.behavioraltype_03.strategy_12.strategymodel_17.context.Context;
import com.yellowgg.behavioraltype_03.strategy_12.strategymodel_17.pen.BluePen;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/7/29 21:50
 */
public class Run {
    public static void main(String[] args) {
        Context context = new Context(new BluePen());
        context.executeDraw(10, 0, 0);
    }
}
