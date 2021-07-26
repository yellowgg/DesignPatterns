package com.yellowgg.structuraltype_02.adapter_06.classadaptermodel_12.phone;

import com.yellowgg.structuraltype_02.adapter_06.classadaptermodel_12.voltge.IVoltage5V;

/**
 * @Description: 手机
 * @Author: yellowgg
 * @Date: Created in 2021/7/23 15:25
 */
public class Phone {

    /**
     * 充电
     *
     * @param iVoltage5V
     */
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V, 可以充电~~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V, 不能充电~~");
        }
    }
}