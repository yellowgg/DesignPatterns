package com.yellowgg.creativetype_01.factory_01.factorymodel_02.food;

import lombok.Data;
import lombok.ToString;

/**
 * @Description: 兰州拉面
 * @Author: yellowgg
 * @Date: Created in 2021/6/22 16:06
 */
@Data
@ToString(callSuper = true)
public class LanZhouNoodle extends Food {
    /**
     * 辣度
     */
    private int spicy;
}
