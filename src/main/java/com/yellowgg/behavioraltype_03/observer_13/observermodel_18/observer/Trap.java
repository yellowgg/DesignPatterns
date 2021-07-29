package com.yellowgg.behavioraltype_03.observer_13.observermodel_18.observer;

/**
 * @Description: 陷阱
 * @Author: yellowgg
 * @Date: Created in 2021/7/29 22:04
 */
public class Trap implements Observer {
    @Override
    public void update() {
        if (inRange()) {
            System.out.println("陷阱 困住主角！");
        }
    }

    private boolean inRange() {
        //判断主角是否在自己的影响范围内，这里忽略细节，直接返回true
        return true;
    }
}
