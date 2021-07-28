package com.yellowgg.structuraltype_02.flyweight_11.flyweightmodel_16.chesspieces;

import java.awt.*;

/**
 * @Description: 白棋
 * Concrete Flyweight 具体享元角色：实现抽象享元角色中所规定的接口
 * @Author: yellowgg
 * @Date: Created in 2021/7/28 22:32
 */
public class WhitePieces implements ChessPieces {

    /**
     * 下子
     *
     * @param g
     * @param pt
     */
    @Override
    public void downPieces(Graphics g, Point pt) {
        g.setColor(Color.WHITE);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
