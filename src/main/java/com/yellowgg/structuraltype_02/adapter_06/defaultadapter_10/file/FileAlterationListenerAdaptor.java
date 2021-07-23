package com.yellowgg.structuraltype_02.adapter_06.defaultadapter_10.file;

import java.io.File;

/**
 * @Description: 默认适配器
 * 实现了接口，方法都是空方法，供别的子类继续继承并且只实现想要实现的方法
 * @Author: yellowgg
 * @Date: Created in 2021/7/23 14:29
 */
public class FileAlterationListenerAdaptor implements FileAlterationListener {
    @Override
    public void onDirectoryCreate(File directory) {

    }

    @Override
    public void onDirectoryChange(File directory) {

    }

    @Override
    public void onDirectoryDelete(File directory) {

    }

    @Override
    public void onFileCreate(File file) {

    }

    @Override
    public void onFileChange(File file) {

    }

    @Override
    public void onFileDelete(File file) {

    }
}
