package com.dong.patterns.abstractfactory;
/**
 *
 *  Generated by StarUML(tm) Java Add-In
 *
 *  @ Project : Untitled
 *  @ File Name : DBFactory.java
 *  @ Date : 2018/9/30
 *  @ Author : dong
 *  @ keywords : 
 *
 */




public interface DBFactory {
    public Connection createConnection();
    public Statement createStatement();
}
