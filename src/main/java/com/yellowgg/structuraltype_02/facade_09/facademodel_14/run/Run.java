package com.yellowgg.structuraltype_02.facade_09.facademodel_14.run;

import com.yellowgg.structuraltype_02.facade_09.facademodel_14.shape.Circle;
import com.yellowgg.structuraltype_02.facade_09.facademodel_14.shape.Rectangle;
import com.yellowgg.structuraltype_02.facade_09.facademodel_14.shape.Shape;
import com.yellowgg.structuraltype_02.facade_09.facademodel_14.shape.ShapeMaker;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/7/28 20:49
 */
public class Run {
    public static void main(String[] args) {
        // 画一个圆形
        Shape circle = new Circle();
        circle.draw();

        // 画一个长方形
        Shape rectangle = new Rectangle();
        rectangle.draw();


        System.out.println("/*****************************************************/");

        // 使用门面
        ShapeMaker shapeMaker = new ShapeMaker();

        // 客户端调用现在更加清晰了
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
