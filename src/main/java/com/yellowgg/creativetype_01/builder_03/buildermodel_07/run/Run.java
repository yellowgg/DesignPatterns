package com.yellowgg.creativetype_01.builder_03.buildermodel_07.run;

import com.yellowgg.creativetype_01.builder_03.buildermodel_07.entity.User;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/7/21 17:13
 */
public class Run {
    public static void main(String[] args) {
        User user = User.builder()
                .age(10)
                .password("1234")
                .name("aa")
                .nickName("bb")
                .build();

        System.out.println(user);
    }
}
