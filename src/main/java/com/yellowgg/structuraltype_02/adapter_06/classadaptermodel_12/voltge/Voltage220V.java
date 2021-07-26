package com.yellowgg.structuraltype_02.adapter_06.classadaptermodel_12.voltge;


/**
 * @Description: 被适配的类
 * @Author: yellowgg
 * @Date: Created in 2021/7/23 15:21
 */
public class Voltage220V {

    /**
     * 输出220V的电压
     *
     * @return
     */
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}