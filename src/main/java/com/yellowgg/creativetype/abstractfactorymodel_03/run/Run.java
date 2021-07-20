package com.yellowgg.creativetype.abstractfactorymodel_03.run;

import com.yellowgg.creativetype.abstractfactorymodel_03.computer.Computer;
import com.yellowgg.creativetype.abstractfactorymodel_03.cpu.CPU;
import com.yellowgg.creativetype.abstractfactorymodel_03.factory.AmdFactory;
import com.yellowgg.creativetype.abstractfactorymodel_03.factory.ComputerFactory;
import com.yellowgg.creativetype.abstractfactorymodel_03.factory.IntelFactory;
import com.yellowgg.creativetype.abstractfactorymodel_03.mainboard.MainBoard;

/**
 * @Description: 运行
 * @Author: yellowgg
 * @Date: Created in 2021/6/22 16:33
 */
public class Run {
    public static void main(String[] args) {
        // yes amd
        ComputerFactory cf = new AmdFactory();
        // 造cpu
        CPU cpu = cf.makeCPU();
        // 造主板
        MainBoard mainBoard = cf.makeMainBoard();

        // 将同一个厂出品的东西组合
        Computer computer = new Computer(cpu, mainBoard);
        System.out.println(computer);

        cf = new IntelFactory();
        // 造cpu
        cpu = cf.makeCPU();
        // 造主板
        mainBoard = cf.makeMainBoard();

        // 将同一个厂出品的东西组合
        computer = new Computer(cpu, mainBoard);
        System.out.println(computer);
    }
}
