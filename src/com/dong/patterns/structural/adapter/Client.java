package com.dong.patterns.structural.adapter;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Adapter Pattern
//  @ File Name : Client.java
//  @ Date : 2018/10/13
//  @ Author : dong
//  @ Description : 客户端
//




public class Client {
    public static void main(String[] args) {
        ScoreOperation operation;
        operation = (ScoreOperation)XMLUtil.getBean();
        int[] scores = {84, 76,50, 69, 90, 100, 60, 59};
        int[] result;
        
        Client client = new Client();
        result = operation.sort(scores);
        client.printSort(result);
        
        client.isOrNotFind(66);
        
    }
    
    /**
     * 打印排序后的数据
     * @param result
     */
    public void printSort(int[] result) {
        System.out.println("成绩排序结果");
        for (int i : result) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
    
    /**
     * 是否找到指定数据
     * @param score
     */
    public void isOrNotFind(int score) {
        System.out.println("查找成绩" + score + ":");
        if(score != -1) {
            System.out.println("查找到成绩" + score);
        } else {
            System.out.println("未找到成绩" + score);
        }
    }
    
}
