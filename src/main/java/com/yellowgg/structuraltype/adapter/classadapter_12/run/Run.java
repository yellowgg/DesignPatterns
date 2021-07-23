package com.yellowgg.structuraltype.adapter.classadapter_12.run;

import com.yellowgg.structuraltype.adapter.classadapter_12.phone.Phone;
import com.yellowgg.structuraltype.adapter.classadapter_12.voltge.VoltageAdapter;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/7/23 15:24
 */
public class Run {
    public static void main(String[] args) {
        System.out.println(" === 类适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}