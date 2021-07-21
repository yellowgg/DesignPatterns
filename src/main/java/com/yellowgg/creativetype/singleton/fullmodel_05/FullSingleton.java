package com.yellowgg.creativetype.singleton.fullmodel_05;

/**
 * @Description: 饱汉模式-双重检测锁
 * 关于volatile关键字的，看小灰的这篇文章https://blog.csdn.net/bjweimengshu/article/details/78716839
 * @Author: yellowgg
 * @Date: Created in 2021/7/20 15:01
 */
public class FullSingleton {

    // 首先，也是先堵死 new FullSingleton() 这条路
    private FullSingleton() {
    }

    // 和饿汉模式相比，这边不需要先实例化出来，注意这里的 volatile，它是必须的
    private static volatile FullSingleton instance = null;

    public static FullSingleton getInstance() {
        if (instance == null) {
            // 加锁
            synchronized (FullSingleton.class) {
                // 这一次判断也是必须的，不然会有并发问题
                if (instance == null) {
                    instance = new FullSingleton();
                }
            }
        }
        return instance;
    }

}
