package com.yellowgg.structuraltype_02.combination_10.combinationmodel_15.run;

import com.yellowgg.structuraltype_02.combination_10.combinationmodel_15.library.GraphicsLibrary;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/7/28 21:44
 */
public class Run {
    public static void main(String[] args) {
        GraphicsLibrary gl = new GraphicsLibrary();

        //使用基础图形 line
        System.out.println("第一个图形:");
        gl.getGraphicsObjects().get(0).draw();

        //使用组合图形 composite
        System.out.println("第二个图形:");
        gl.getGraphicsObjects().get(3).draw();
    }
}
