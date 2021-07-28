package com.yellowgg.structuraltype_02.combination_10.combinationmodel_15.graphics;

/**
 * @Description: 图形对象
 * Component 抽象构件角色：是组合中对象声明接口，实现所有类共有接口的默认行为
 * @Author: yellowgg
 * @Date: Created in 2021/7/28 21:28
 */
public abstract class GraphicsObject {
    /**
     * 绘画
     */
    public abstract void draw();

    /**
     * 添加对象
     *
     * @param object
     */
    public void add(GraphicsObject object) {
        throw new UnsupportedOperationException();
    }

    /**
     * 删除对象
     *
     * @param object
     */
    public void remove(GraphicsObject object) {
        throw new UnsupportedOperationException();
    }
}
