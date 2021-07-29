package com.yellowgg.behavioraltype_03.observer_13.observermodel_18.run;

import com.yellowgg.behavioraltype_03.observer_13.observermodel_18.observer.Monster;
import com.yellowgg.behavioraltype_03.observer_13.observermodel_18.observer.Trap;
import com.yellowgg.behavioraltype_03.observer_13.observermodel_18.observer.Treasure;
import com.yellowgg.behavioraltype_03.observer_13.observermodel_18.subject.Hero;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/7/29 22:06
 */
public class Run {

    public static void main(String[] args) {
        //初始化对象
        Hero hero = new Hero();
        Monster monster = new Monster();
        Trap trap = new Trap();
        Treasure treasure = new Treasure();

        //注册观察者
        hero.attachObserver(monster);
        hero.attachObserver(trap);
        hero.attachObserver(treasure);

        //移动事件
        hero.move();
    }

}
