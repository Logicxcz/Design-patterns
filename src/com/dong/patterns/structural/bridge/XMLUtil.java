package com.dong.patterns.structural.bridge;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

/**
 * XML�������ȡ�����ļ�
 * @ClassName: XMLUtil 
 * @Description: 
 * @author: dong
 * @date: 2018��9��30�� ����11:03:20 
 * @keyword: 
 *
 */
public class XMLUtil {

	public static Object getBean(int nodeNum) {
		DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			
			Document doc;
			doc = builder.parse(new File("src\\com\\dong\\patterns\\structural\\bridge\\config.xml"));
			// /Design-patterns/src/com/dong/patterns/factorymethod/config.xml
			// src\\com\\dong\\patterns\\factorymethod\\config.xml
			
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(nodeNum).getFirstChild();   // ��������� �����ȡ��Ӧ��ʵ��
			String cName = "com.dong.patterns.structural.bridge." + classNode.getNodeValue().trim();   // ƴ����·��			
			
			// ͨ����������ʵ�����󲢽��䷵��
			Class c = Class.forName(cName);
			Object obj = c.newInstance();
			return obj;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}
