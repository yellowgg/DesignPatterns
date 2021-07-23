package com.yellowgg.creativetype_01.factory_01.abstractfactorymodel_03.factory;

import com.yellowgg.creativetype_01.factory_01.abstractfactorymodel_03.cpu.AmdCPU;
import com.yellowgg.creativetype_01.factory_01.abstractfactorymodel_03.cpu.CPU;
import com.yellowgg.creativetype_01.factory_01.abstractfactorymodel_03.mainboard.AmdMainBoard;
import com.yellowgg.creativetype_01.factory_01.abstractfactorymodel_03.mainboard.MainBoard;

/**
 * @Description:
 * @Author: yellowgg
 * @Date: Created in 2021/6/24 15:51
 */
public class AmdFactory implements ComputerFactory {
    @Override
    public CPU makeCPU() {
        return new AmdCPU().setName("admCPU");
    }

    @Override
    public MainBoard makeMainBoard() {
        return new AmdMainBoard().setName("amd主板");
    }
}
