package com.yellowgg.structuraltype_02.bridge_07.bridgemodel_12.brush;

/**
 * @Description: 细毛笔
 * @Author: yellowgg
 * @Date: Created in 2021/7/26 18:21
 */
public class FineBrushPenRefinedAbstraction extends BrushPenAbstraction {
    /**
     * 每种笔都有自己的实现
     */
    @Override
    public void operationDraw() {
        System.out.println("Fine and " + imp.bepaint() + " drawing!");
    }
}
