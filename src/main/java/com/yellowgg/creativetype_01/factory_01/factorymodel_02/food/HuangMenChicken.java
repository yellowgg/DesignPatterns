package com.yellowgg.creativetype_01.factory_01.factorymodel_02.food;

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
}
