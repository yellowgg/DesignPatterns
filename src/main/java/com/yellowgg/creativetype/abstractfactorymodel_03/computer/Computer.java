package com.yellowgg.creativetype.abstractfactorymodel_03.computer;

import com.yellowgg.creativetype.abstractfactorymodel_03.cpu.CPU;
import com.yellowgg.creativetype.abstractfactorymodel_03.mainboard.MainBoard;
import lombok.Data;

/**
 * @Description: 电脑
 * @Author: yellowgg
 * @Date: Created in 2021/6/24 15:57
 */
@Data
public class Computer {
    private CPU cpu;
    private MainBoard mainBoard;

    public Computer(CPU cpu, MainBoard mainBoard) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
    }
}
