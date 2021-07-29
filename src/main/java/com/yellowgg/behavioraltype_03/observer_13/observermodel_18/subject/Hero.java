package com.yellowgg.behavioraltype_03.observer_13.observermodel_18.subject;

/**
 * @Description: 主角
 * @Author: yellowgg
 * @Date: Created in 2021/7/29 22:05
 */
public class Hero extends Subject {
    public void move() {
        System.out.println("主角向前移动");
        notifyObservers();
    }
}
