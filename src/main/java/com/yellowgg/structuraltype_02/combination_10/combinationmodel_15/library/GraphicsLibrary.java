package com.yellowgg.structuraltype_02.combination_10.combinationmodel_15.library;

import com.yellowgg.structuraltype_02.combination_10.combinationmodel_15.graphics.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 图形库
 * @Author: yellowgg
 * @Date: Created in 2021/7/28 21:42
 */
public class GraphicsLibrary {
    private List<GraphicsObject> components;

    public GraphicsLibrary() {
        components = new ArrayList<>();
        initData();
    }

    public void initData() {
        GraphicsObject line = new Line();
        GraphicsObject circle = new Circle();
        GraphicsObject rectangle = new Rectangle();

        //添加基础图形到图形库中
        components.add(line);
        components.add(circle);
        components.add(rectangle);

        //创建并添加组合图形到图形库中
        GraphicsObject composite = new ComposedGraphicsObject();
        composite.add(line);
        composite.add(rectangle);
        components.add(composite);

    }

    public List<GraphicsObject> getGraphicsObjects() {
        return components;
    }
}
