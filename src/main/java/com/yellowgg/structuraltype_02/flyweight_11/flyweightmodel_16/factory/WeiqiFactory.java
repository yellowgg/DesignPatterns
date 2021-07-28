package com.yellowgg.structuraltype_02.flyweight_11.flyweightmodel_16.factory;

import com.yellowgg.structuraltype_02.flyweight_11.flyweightmodel_16.chesspieces.BlackPieces;
import com.yellowgg.structuraltype_02.flyweight_11.flyweightmodel_16.chesspieces.ChessPieces;
import com.yellowgg.structuraltype_02.flyweight_11.flyweightmodel_16.chesspieces.WhitePieces;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 围棋工厂
 * FlyweightFactory 享元工厂角色：它是关键字 key 来管理具体享元
 * @Author: yellowgg
 * @Date: Created in 2021/7/28 22:28
 */
public class WeiqiFactory {
    private List<ChessPieces> qz;

    public WeiqiFactory() {
        qz = new ArrayList<>();
        ChessPieces w = new WhitePieces();
        qz.add(w);
        ChessPieces b = new BlackPieces();
        qz.add(b);
    }

    public ChessPieces getChessPieces(String type) {
        if (type.equalsIgnoreCase("w")) {
            return (ChessPieces) qz.get(0);
        } else if (type.equalsIgnoreCase("b")) {
            return (ChessPieces) qz.get(1);
        } else {
            return null;
        }
    }
}
