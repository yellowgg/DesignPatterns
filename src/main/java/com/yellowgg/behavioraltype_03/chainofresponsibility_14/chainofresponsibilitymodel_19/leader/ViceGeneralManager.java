package com.yellowgg.behavioraltype_03.chainofresponsibility_14.chainofresponsibilitymodel_19.leader;

import com.yellowgg.behavioraltype_03.chainofresponsibility_14.chainofresponsibilitymodel_19.model.LeaveRequest;

import java.util.Objects;

/**
 * @Description:
 * @Author: yellowgg
 * @Date: Created in 2021/7/30 13:47
 */
public class ViceGeneralManager extends Leader {

    public ViceGeneralManager(String name) {
        super(name);
    }

    /**
     * 处理请求的核心的业务方法
     *
     * @param request
     */
    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 20) {
            System.out.println("员工：" + request.getEmpName() + "请假，天数：" + request.getLeaveDays() + ",理由：" + request.getReason());
            System.out.println("副总经理：" + this.name + ",审批通过！");
        } else {
            if (Objects.nonNull(nextLeader)) {
                nextLeader.handleRequest(request);
            }
        }
    }
}
