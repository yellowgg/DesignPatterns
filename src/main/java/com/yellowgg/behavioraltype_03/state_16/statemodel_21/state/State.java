package com.yellowgg.behavioraltype_03.state_16.statemodel_21.state;

import com.yellowgg.behavioraltype_03.state_16.statemodel_21.context.Context;

/**
 * @Description: 状态接口
 * @Author: yellowgg
 * @Date: Created in 2021/7/30 14:46
 */
public interface State {

    /**
     * 设置时间
     *
     * @param context
     * @param hour
     */
    void doClock(Context context, int hour);

    /**
     * 使用金库
     *
     * @param context
     */
    void doUse(Context context);

    /**
     * 按下警铃
     *
     * @param context
     */
    void doAlarm(Context context);

    /**
     * 正常通话
     *
     * @param context
     */
    void doPhone(Context context);
}
