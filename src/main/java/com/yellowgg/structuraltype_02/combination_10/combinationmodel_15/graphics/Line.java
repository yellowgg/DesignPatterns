package com.yellowgg.structuraltype_02.combination_10.combinationmodel_15.graphics;

/**
 * @Description: 直线
 * Leaf 树叶构件角色：单个对象，叶节点没有子节点
 * @Author: yellowgg
 * @Date: Created in 2021/7/28 21:32
 */
public class Line extends GraphicsObject {
    /**
     * 绘画
     */
    @Override
    public void draw() {
        System.out.println("draw line");
    }
}
