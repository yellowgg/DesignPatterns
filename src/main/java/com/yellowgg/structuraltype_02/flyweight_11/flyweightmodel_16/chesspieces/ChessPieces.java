package com.yellowgg.structuraltype_02.flyweight_11.flyweightmodel_16.chesspieces;

import java.awt.*;

/**
 * @Description: 棋子
 * Flyweight 抽象享元角色：是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入
 * @Author: yellowgg
 * @Date: Created in 2021/7/28 22:30
 */
public interface ChessPieces {

    /**
     * 下子
     *
     * @param g
     * @param pt
     */
    void downPieces(Graphics g, Point pt);    //下子
}
