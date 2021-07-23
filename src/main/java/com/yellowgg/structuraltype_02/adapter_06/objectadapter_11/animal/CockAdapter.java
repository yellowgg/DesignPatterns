package com.yellowgg.structuraltype_02.adapter_06.objectadapter_11.animal;

/**
 * @Description: 鸭鸭适配器
 * 毫无疑问，首先，这个适配器肯定需要 implements Duck，这样才能当做鸭来用
 * @Author: yellowgg
 * @Date: Created in 2021/7/23 15:13
 */
public class CockAdapter implements Duck {

    Cock cock;

    // 构造方法中需要一个鸡的实例，此类就是将这只鸡适配成鸭来用
    public CockAdapter(Cock cock) {
        this.cock = cock;
    }

    /**
     * 呱呱叫
     */
    @Override
    public void quack() {
        // 成功伪装，内部其实是一只鸡的咕咕叫
        cock.gobble();
    }

    /**
     * 飞
     */
    @Override
    public void fly() {
        // 都是一样的飞，不管是鸡飞还是鸭飞，都是好飞
        cock.fly();
    }
}
