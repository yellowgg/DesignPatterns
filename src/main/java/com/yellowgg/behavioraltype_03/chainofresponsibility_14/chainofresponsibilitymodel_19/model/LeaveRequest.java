package com.yellowgg.behavioraltype_03.chainofresponsibility_14.chainofresponsibilitymodel_19.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description: 请假实体
 * @Author: yellowgg
 * @Date: Created in 2021/7/30 11:19
 */
@Data
@AllArgsConstructor
public class LeaveRequest {

    /**
     * 员工名称
     */
    private String empName;

    /**
     * 请假天数
     */
    private int leaveDays;

    /**
     * 请假原因
     */
    private String reason;
}
