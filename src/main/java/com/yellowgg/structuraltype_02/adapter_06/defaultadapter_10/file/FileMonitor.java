package com.yellowgg.structuraltype_02.adapter_06.defaultadapter_10.file;

import java.io.File;

/**
 * @Description: 实现想要的方法
 * @Author: yellowgg
 * @Date: Created in 2021/7/23 14:49
 */
public class FileMonitor extends FileAlterationListenerAdaptor {
    public void onFileCreate(final File file) {
        // 文件创建
        System.out.println("文件已创建");
    }

    public void onFileDelete(final File file) {
        // 文件删除
        System.out.println("文件已删除");
    }

    public static void main(String[] args) {
        new FileMonitor().onFileCreate(new File(""));
    }
}
