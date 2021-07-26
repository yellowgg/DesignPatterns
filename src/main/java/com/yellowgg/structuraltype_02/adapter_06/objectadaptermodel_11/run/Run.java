package com.yellowgg.structuraltype_02.adapter_06.objectadaptermodel_11.run;

import com.yellowgg.structuraltype_02.adapter_06.objectadaptermodel_11.animal.Cock;
import com.yellowgg.structuraltype_02.adapter_06.objectadaptermodel_11.animal.CockAdapter;
import com.yellowgg.structuraltype_02.adapter_06.objectadaptermodel_11.animal.Duck;
import com.yellowgg.structuraltype_02.adapter_06.objectadaptermodel_11.animal.WildCock;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/7/23 15:15
 */
public class Run {
    public static void main(String[] args) {
        // 有一只野鸡
        Cock wildCock = new WildCock();
        // 成功将野鸡适配成鸭
        Duck duck = new CockAdapter(wildCock);
        duck.quack();
        duck.fly();
    }
}
