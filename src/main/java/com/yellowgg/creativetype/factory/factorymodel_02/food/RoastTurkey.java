package com.yellowgg.creativetype.factory.factorymodel_02.food;

import lombok.Data;
import lombok.ToString;

/**
 * @Description: 烤火鸡
 * @Author: yellowgg
 * @Date: Created in 2021/6/23 15:28
 */
@Data
@ToString(callSuper = true)
public class RoastTurkey extends Food {
    /**
     * 煮熟程度
     */
    private int degreeOfCooked;
}
