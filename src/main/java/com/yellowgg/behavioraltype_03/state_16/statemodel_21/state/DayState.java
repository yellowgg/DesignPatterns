package com.yellowgg.behavioraltype_03.state_16.statemodel_21.state;

import com.yellowgg.behavioraltype_03.state_16.statemodel_21.context.Context;

/**
 * @Description: 白天状态
 * @Author: yellowgg
 * @Date: Created in 2021/7/30 14:48
 */
public class DayState implements State {

    private static DayState singleton = new DayState();

    private DayState() {
    }

    public static State getInstance() {
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
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    /**
     * 使用金库
     *
     * @param context
     */
    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库(白天)");
    }

    /**
     * 按下警铃
     *
     * @param context
     */
    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(白天)");
    }

    /**
     * 正常通话
     *
     * @param context
     */
    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话(白天)");
    }

    public String toString() {
        return "[白天]";
    }
}
