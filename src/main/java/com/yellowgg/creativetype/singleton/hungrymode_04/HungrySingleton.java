package com.yellowgg.creativetype.singleton.hungrymode_04;

import java.util.Date;

/**
 * @Description: 饿汉模式
 * @Author: yellowgg
 * @Date: Created in 2021/7/20 14:56
 */
public class HungrySingleton {

    // 首先，将 new HungrySingleton() 堵死
    private HungrySingleton() {
    }

    // 创建私有静态实例，意味着这个类第一次使用的时候就会进行创建
    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }

    // 瞎写一个静态方法。这里想说的是，如果我们只是要调用 HungrySingleton.getDate(...)，
    // 本来是不想要生成 HungrySingleton 实例的，不过没办法，已经生成了
    public static Date getDate(String mode) {
        return new Date();
    }
}

/**
 * 很多人都能说出饿汉模式的缺点，
 * 但是一般生产过程中，很少碰到这种情况：定义了一个单例的类，不需要其实例，可是却把一个或几个你会用到的静态方法塞到这个类中。
 */
