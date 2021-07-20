package com.yellowgg.creativetype.factory.abstractfactorymodel_03.factory;

import com.yellowgg.creativetype.factory.abstractfactorymodel_03.cpu.CPU;
import com.yellowgg.creativetype.factory.abstractfactorymodel_03.cpu.IntelCPU;
import com.yellowgg.creativetype.factory.abstractfactorymodel_03.mainboard.IntelMainBoard;
import com.yellowgg.creativetype.factory.abstractfactorymodel_03.mainboard.MainBoard;

/**
 * @Description:
 * @Author: yellowgg
 * @Date: Created in 2021/6/24 15:50
 */
public class IntelFactory implements ComputerFactory {
    @Override
    public CPU makeCPU() {
        return new IntelCPU().setName("英特尔CPUi10");
    }

    @Override
    public MainBoard makeMainBoard() {
        return new IntelMainBoard().setName("英特尔主板呱呱");
    }
}
