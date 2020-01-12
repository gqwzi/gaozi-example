package com.gao.gaozi.example.testFilePath;

import java.io.File;

/**
 * @Author wanghongmei
 * @Date 2020/1/12 22:38
 * @Version 1.0
 */
public class TestFilePath {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));// 当前路径
        System.out.println(File.pathSeparator);// 路径分割
        System.out.println(File.pathSeparatorChar);// 路径分割符
        System.out.println(File.separator);// 目录分割
        System.out.println(File.separatorChar);// 目录分割符
    }

}
