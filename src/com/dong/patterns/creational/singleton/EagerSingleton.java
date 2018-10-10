package com.dong.patterns.creational.singleton;

/**
 * ����ʽ����
 * �ŵ㣺�����ٶȡ���Ӧʱ��죬���迼�Ƕ��̷߳��ʵ����������ȷ��ʵ����Ψһ��
 * ȱ�㣺��Ҫ���ĸ����ϵͳ��Դ������ʱ�����
 * @author Administrator
 *
 */
public class EagerSingleton {
	
	private static final EagerSingleton instance = new EagerSingleton();	// �������ʱ����ʵ����
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}

}
