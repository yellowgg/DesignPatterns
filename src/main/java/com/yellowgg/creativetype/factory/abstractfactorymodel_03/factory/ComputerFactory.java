package com.yellowgg.creativetype.factory.abstractfactorymodel_03.factory;

import com.yellowgg.creativetype.factory.abstractfactorymodel_03.cpu.CPU;
import com.yellowgg.creativetype.factory.abstractfactorymodel_03.mainboard.MainBoard;

/**
 * @Description: 电脑抽象工厂
 * @Author: yellowgg
 * @Date: Created in 2021/6/23 17:21
 */
public interface ComputerFactory {
    CPU makeCPU();

    MainBoard makeMainBoard();
}
