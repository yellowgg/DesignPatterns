package com.yellowgg.structuraltype.adapter.classadapter_12.voltge;


/**
 * @Description: 适配器类
 * @Author: yellowgg
 * @Date: Created in 2021/7/23 15:22
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = output220V();
        //转成 5v
        int dstV = srcV / 44;
        return dstV;
    }
}