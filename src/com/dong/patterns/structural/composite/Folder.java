package com.dong.patterns.structural.composite;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Composite Pattern
//  @ File Name : Folder.java
//  @ Date : 2018/10/26
//  @ Author : dong
//
//

import java.util.ArrayList;

public class Folder extends AbstractFile {
    // 定义集合fileList，用于存储AbstractFile类型的成员
    private ArrayList fileList = new ArrayList<>();
    private String name;
    
    public Folder(String name) {
        this.name = name;
    }
    public void add(AbstractFile file) {
        fileList.add(file);
    }
    
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }
    
    public AbstractFile getChild(int i) {
        return (AbstractFile)fileList.get(i);
    
    }
    
    public void killVirus() {
        System.out.println("**** 对文件夹'" + name + "'进行杀毒");  // 模拟杀毒
        
        // 递归调用成员构件的killVirus方法
        for (Object file : fileList) {
            ((AbstractFile) file).killVirus();
        }
    }
}
