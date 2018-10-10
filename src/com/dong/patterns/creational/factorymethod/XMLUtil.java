package com.dong.patterns.creational.factorymethod;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

/**
 * XML�������ȡ�����ļ�
 * @author Administrator
 *
 */
public class XMLUtil {

	public static Object getBean() {
		DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			
			Document doc;
			doc = builder.parse(new File("src\\com\\dong\\patterns\\factorymethod\\config.xml"));
			// /Design-patterns/src/com/dong/patterns/factorymethod/config.xml
			// src\\com\\dong\\patterns\\factorymethod\\config.xml
			
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			String cName = classNode.getNodeValue().trim();
			
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
