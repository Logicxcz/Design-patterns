package com.dong.patterns.singleton;

/**
 * IoDH
 * ����Java�������ԣ��ڵ�����������һ����̬�ڲ���
 * 
 * �ŵ㣺�ȿ���ʵ���ӳټ��أ��ֿ��Ա�֤�̰߳�ȫ����Ӱ��ϵͳ����
 * ȱ�㣺�����ڱ����������
 * @author Administrator
 *
 */
public class SingletonIoDH {
	
	private SingletonIoDH() {
		
	}
	
	// ��̬�ڲ���
	private static class HolderClass {
		private final static SingletonIoDH instance = new SingletonIoDH();
		
	}

	public static SingletonIoDH getInstance() {
		return HolderClass.instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonIoDH s1, s2;
		s1 = SingletonIoDH.getInstance();
		s2 = SingletonIoDH.getInstance();
		
		System.out.println(s1 == s2);

	}

}
