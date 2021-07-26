package com.yellowgg.structuraltype_02.bridge_07.bridgemodel_12.run;

import com.yellowgg.structuraltype_02.bridge_07.bridgemodel_12.brush.BigBrushPenRefinedAbstraction;
import com.yellowgg.structuraltype_02.bridge_07.bridgemodel_12.brush.BrushPenAbstraction;
import com.yellowgg.structuraltype_02.bridge_07.bridgemodel_12.brush.FineBrushPenRefinedAbstraction;
import com.yellowgg.structuraltype_02.bridge_07.bridgemodel_12.color.BlueColorImpl;
import com.yellowgg.structuraltype_02.bridge_07.bridgemodel_12.color.GreenColorImpl;
import com.yellowgg.structuraltype_02.bridge_07.bridgemodel_12.color.RedColorImpl;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/7/26 18:22
 */
public class Run {
    public static void main(String[] args) {
        BrushPenAbstraction brushPen = new BigBrushPenRefinedAbstraction();
        // 粗毛笔画红色
        brushPen.setImplementor(new RedColorImpl());
        brushPen.operationDraw();

        // 粗毛笔画蓝色
        brushPen.setImplementor(new BlueColorImpl());
        brushPen.operationDraw();

        // 细毛笔画绿色
        brushPen = new FineBrushPenRefinedAbstraction();
        brushPen.setImplementor(new GreenColorImpl());
        brushPen.operationDraw();

    }
}
