package com.yellowgg.behavioraltype_03.state_16.statemodel_21.run;

import com.yellowgg.behavioraltype_03.state_16.statemodel_21.context.SafeFrame;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/7/30 15:05
 */
public class Run {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                // 设置时间
                frame.setClock(hour);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
