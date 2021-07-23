package com.yellowgg.structuraltype.adapter.defaultadapter_10.file;

import java.io.File;

/**
 * @Description: 定义了很多方法的接口
 * Appache commons-io 包中的 FileAlterationListener
 * @Author: yellowgg
 * @Date: Created in 2021/7/23 14:31
 */
public interface FileAlterationListener {


    void onDirectoryCreate(final File directory);

    void onDirectoryChange(final File directory);

    void onDirectoryDelete(final File directory);

    void onFileCreate(final File file);

    void onFileChange(final File file);

    void onFileDelete(final File file);


}
