package com.dong.patterns.creational.singleton;
/**
 * ����ģʽ
 * @author Administrator
 *
 */
public class TaskManager {
	
	private static TaskManager tm = null;
	private static int i = 0;
	
	private TaskManager() {	// ��ʼ�����ڡ����캯��˽�У��������޷�����TaskManager����
		
	}
	
	public void displayProcesses() {
		System.out.println("��ʾ����");
	}
	
	public void displayServices() {
		System.out.println("��ʾ����");
	}

	// ��õ�һʵ��
	public static TaskManager getInstance() {
		if(tm == null) {
			return new TaskManager();
		}
		return tm;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskManager tm = new TaskManager();
		tm.displayProcesses();

	}

}
