package com.yellowgg.structuraltype_02.combination_10.combinationmodel_15.graphics;

/**
 * @Description: 矩形
 * Leaf 树叶构件角色：单个对象，叶节点没有子节点
 * @Author: yellowgg
 * @Date: Created in 2021/7/28 21:34
 */
public class Rectangle extends GraphicsObject {
    /**
     * 绘画
     */
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
