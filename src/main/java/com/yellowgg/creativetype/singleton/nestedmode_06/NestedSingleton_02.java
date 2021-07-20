package com.yellowgg.creativetype.singleton.nestedmode_06;

/**
 * @Description: 嵌套类单例模式
 * @Author: yellowgg
 * @Date: Created in 2021/7/20 15:20
 */
public class NestedSingleton_02 {
    private static NestedSingleton_02 instance = null;

    private static class Inner {
        static {
            instance = new NestedSingleton_02();
        }
    }

    public static NestedSingleton_02 getInstance() {
        return instance;
    }
}
