package com.dong.patterns.structural.adapter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * JDK Դ����������ģʽʵ������
 * Reader(Target),InputStreamReader(Adapter),InputStream(Source)
 * 
 * @ClassName: TestInputStreamReader 
 * @Description: 
 * @author: dong
 * @date: 2018��10��14�� ����6:12:09 
 * @keyword: 
 *
 */
public class TestInputStreamReader {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InputStreamReader in;
        
        try {
            // aaa.txt�ļ���TestInputStreamReader�ļ�����ͬһĿ¼�������·����ȡ
            in = new InputStreamReader(new FileInputStream(TestInputStreamReader.class.getResource("aaa.txt").getPath()));
            
            int ch;
            while((ch = in.read()) != -1) {
                System.out.print((char)ch);
            }
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
