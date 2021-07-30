package com.yellowgg.behavioraltype_03.state_16.statemodel_21.context;

import com.yellowgg.behavioraltype_03.state_16.statemodel_21.state.State;

/**
 * @Description: 负责管理状态和联系警报中心的接口，它定义了基本的警报中心的行为
 * @Author: yellowgg
 * @Date: Created in 2021/7/30 14:47
 */
public interface Context {

    /**
     * 设置时间
     *
     * @param hour
     */
    void setClock(int hour);

    /**
     * 改变状态
     *
     * @param state
     */
    void changeState(State state);

    /**
     * 联系警报中心
     *
     * @param msg
     */
    void callSecurityCenter(String msg);

    /**
     * 在警报中心留下记录
     *
     * @param msg
     */
    void recordLog(String msg);
}
