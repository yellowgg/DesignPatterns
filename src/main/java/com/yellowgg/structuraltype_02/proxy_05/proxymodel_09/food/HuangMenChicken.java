package com.yellowgg.structuraltype_02.proxy_05.proxymodel_09.food;

import lombok.Data;
import lombok.ToString;

/**
 * @Description: 黄焖鸡
 * @Author: yellowgg
 * @Date: Created in 2021/6/22 16:07
 */
@Data
@ToString(callSuper = true)
public class HuangMenChicken extends Food {
    /**
     * 调味品
     */
    private String condiment;
    /**
     * 辣度
     */
    private int spicy;
}
