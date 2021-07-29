package com.yellowgg.behavioraltype_03.observer_13.observermodel_18.observer;

/**
 * @Description: 宝石
 * @Author: yellowgg
 * @Date: Created in 2021/7/29 22:04
 */
public class Treasure implements Observer {
    @Override
    public void update() {
        if (inRange()) {
            System.out.println("宝物 为主角加血！");
        }
    }

    private boolean inRange() {
        //判断主角是否在自己的影响范围内，这里忽略细节，直接返回true
        return true;
    }
}
