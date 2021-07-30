package com.yellowgg.behavioraltype_03.chainofresponsibility_14.chainofresponsibilitymodel_19.leader;

import com.yellowgg.behavioraltype_03.chainofresponsibility_14.chainofresponsibilitymodel_19.model.LeaveRequest;

/**
 * @Description:
 * @Author: yellowgg
 * @Date: Created in 2021/7/30 13:48
 */
public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    /**
     * 处理请求的核心的业务方法
     *
     * @param request
     */
    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 30) {
            System.out.println("员工：" + request.getEmpName() + "请假，天数：" + request.getLeaveDays() + ",理由：" + request.getReason());
            System.out.println("总经理：" + this.name + ",审批通过！");
        } else {
            System.out.println("莫非" + request.getEmpName() + "想辞职，居然请假" + request.getLeaveDays() + "天！");
        }
    }
}
