package com.yellowgg.behavioraltype_03.state_16.statemodel_21.state;

import com.yellowgg.behavioraltype_03.state_16.statemodel_21.context.Context;

/**
 * @Description: 黑夜状态
 * @Author: yellowgg
 * @Date: Created in 2021/7/30 14:48
 */
public class NightState implements State {

    private static NightState singleton = new NightState();

    private NightState() {
    }

    public static State getInstance() {                 // 获取唯一实例
        return singleton;
    }

    /**
     * 设置时间
     *
     * @param context
     * @param hour
     */
    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    /**
     * 使用金库
     *
     * @param context
     */
    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急：晚上使用金库！");
    }

    /**
     * 按下警铃
     *
     * @param context
     */
    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(晚上)");
    }

    /**
     * 正常通话
     *
     * @param context
     */
    @Override
    public void doPhone(Context context) {
        context.recordLog("晚上的通话录音");
    }

    public String toString() {
        return "[晚上]";
    }
}
