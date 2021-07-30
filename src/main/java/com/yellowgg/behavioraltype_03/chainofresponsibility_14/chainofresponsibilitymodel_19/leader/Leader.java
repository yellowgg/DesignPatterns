package com.yellowgg.behavioraltype_03.chainofresponsibility_14.chainofresponsibilitymodel_19.leader;

import com.yellowgg.behavioraltype_03.chainofresponsibility_14.chainofresponsibilitymodel_19.model.LeaveRequest;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


/**
 * @Description: 领导抽象类
 * 抽象处理者
 * @Author: yellowgg
 * @Date: Created in 2021/7/30 11:21
 */
@Setter
@RequiredArgsConstructor
public abstract class Leader {

    /**
     * 领导姓名
     */
    protected String name;

    /**
     * 下一个处理的领导
     * 责任链上的后继对象
     */
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    /**
     * 处理请求的核心的业务方法
     *
     * @param request
     */
    public abstract void handleRequest(LeaveRequest request);
}
