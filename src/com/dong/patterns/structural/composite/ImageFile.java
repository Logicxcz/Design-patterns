package com.dong.patterns.structural.composite;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Composite Pattern
//  @ File Name : ImageFile.java
//  @ Date : 2018/10/26
//  @ Author : dong
//
//



// ͼ���ļ��ࣺ Ҷ�ӹ���
public class ImageFile extends AbstractFile {
    private String name;
    
    public ImageFile(String name) {
        this.name = name;
    }
    
    public void add(AbstractFile file) {
        System.out.println("�Բ��𣬲�֧�ָ÷���");
    }
    
    public void remove(AbstractFile file) {
        System.out.println("�Բ��𣬲�֧�ָ÷���");
    }
    
    public AbstractFile getChild(int i) {
        System.out.println("�Բ��𣬲�֧�ָ÷���");
        return null;
    }
    
    public void killVirus() {
        // ģ��ɱ��
        System.out.println("---------��ͼ���ļ�'" + name + "'����ɱ��");
    }
}