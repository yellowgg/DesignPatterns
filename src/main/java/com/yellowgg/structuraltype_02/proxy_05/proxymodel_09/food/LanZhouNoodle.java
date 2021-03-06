package com.yellowgg.structuraltype_02.proxy_05.proxymodel_09.food;

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
