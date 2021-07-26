package com.yellowgg.structuraltype_02.bridge_07.bridgemodel_12.brush;

import com.yellowgg.structuraltype_02.bridge_07.bridgemodel_12.color.ImplementorColor;

/**
 * @Description: 抽象毛笔类
 * @Author: yellowgg
 * @Date: Created in 2021/7/26 18:15
 */
public abstract class BrushPenAbstraction {
    /**
     * 保留对颜色的引用，个人理解为桥梁就是这个变量
     */
    protected ImplementorColor imp;

    /**
     * 每种笔都有自己的实现
     */
    public abstract void operationDraw();

    public void setImplementor(ImplementorColor imp) {
        this.imp = imp;
    }
}
