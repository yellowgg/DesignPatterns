package com.yellowgg.creativetype_01.factory_01.factorymodel_02.food;

import lombok.Data;
import lombok.ToString;

/**
 * @Description: 汉堡
 * @Author: yellowgg
 * @Date: Created in 2021/6/23 15:27
 */
@Data
@ToString(callSuper = true)
public class Hamburger extends Food {
    /**
     * 番茄酱
     */
    private boolean ketchup;
}
