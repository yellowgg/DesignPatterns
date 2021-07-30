package com.yellowgg.behavioraltype_03.chainofresponsibility_14.chainofresponsibilitymodel_19.run;

import com.yellowgg.behavioraltype_03.chainofresponsibility_14.chainofresponsibilitymodel_19.leader.*;
import com.yellowgg.behavioraltype_03.chainofresponsibility_14.chainofresponsibilitymodel_19.model.LeaveRequest;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/7/30 13:49
 */
public class Run {
    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new ViceGeneralManager("王五");
        Leader d = new GeneralManager("阿鹅");

        //组织责任链对象的关系
        a.setNextLeader(b);
        b.setNextLeader(c);
        c.setNextLeader(d);

        //开始请假操作
        LeaveRequest req1 = new LeaveRequest("TOM", 30, "老婆生孩子回家探望！");
        a.handleRequest(req1);
    }
}
