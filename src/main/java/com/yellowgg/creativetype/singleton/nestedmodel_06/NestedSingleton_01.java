package com.yellowgg.creativetype.singleton.nestedmodel_06;

/**
 * @Description: 嵌套类单例模式
 * @Author: yellowgg
 * @Date: Created in 2021/7/20 15:06
 */
public class NestedSingleton_01 {

    // 私有化构造方法
    private NestedSingleton_01() {
    }

    // 主要是使用了 嵌套类可以访问外部类的静态属性和静态方法 的特性
    private static class Holder {
        private static NestedSingleton_01 instance = new NestedSingleton_01();
    }

    public static NestedSingleton_01 getInstance() {
        return Holder.instance;
    }
}
/**
 * 注意，很多人都会把这个嵌套类说成是静态内部类，
 * 严格地说，内部类和嵌套类是不一样的，它们能访问的外部类权限也是不一样的。
 * 内部类是java类里面的类
 * 嵌套类是java类里面的static修饰的类
 */