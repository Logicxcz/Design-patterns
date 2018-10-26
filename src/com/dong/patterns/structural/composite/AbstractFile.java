package com.dong.patterns.structural.composite;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Composite Pattern
//  @ File Name : AbstractFile.java
//  @ Date : 2018/10/26
//  @ Author : dong
//
//



// 抽象文件类： 抽象构件
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();
}
