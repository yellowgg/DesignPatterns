package com.yellowgg.structuraltype_02.combination_10.combinationmodel_15.graphics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 组合图形
 * Composite 树枝构件角色：定义有子部件的组合部件行为，存储子部件，在Component接口中实现与子部件有关的操作
 * @Author: yellowgg
 * @Date: Created in 2021/7/28 21:36
 */
public class ComposedGraphicsObject extends GraphicsObject {

    /**
     * 存储子部件
     */
    private List<GraphicsObject> components;

    public ComposedGraphicsObject() {
        components = new ArrayList<>();
    }

    /**
     * 组合绘画
     */
    @Override
    public void draw() {
        for (GraphicsObject component : components) {
            component.draw();
        }
    }

    /**
     * 添加对象
     *
     * @param object
     */
    @Override
    public void add(GraphicsObject object) {
        components.add(object);
    }

    /**
     * 删除对象
     *
     * @param object
     */
    @Override
    public void remove(GraphicsObject object) {
        components.remove(object);
    }
}
