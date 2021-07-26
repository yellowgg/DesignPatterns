package com.yellowgg.structuraltype_02.adapter_06.objectadaptermodel_11.animal;

/**
 * @Description: 小野鸡
 * @Author: yellowgg
 * @Date: Created in 2021/7/23 15:12
 */
public class WildCock implements Cock {
    /**
     * 咕咕叫
     */
    @Override
    public void gobble() {
        System.out.println("咕咕叫");
    }

    /**
     * 飞
     */
    @Override
    public void fly() {
        System.out.println("鸡也会飞哦");
    }
}
