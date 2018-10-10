package com.dong.patterns.creational.singleton;
/**
 * ����ʽ����ģʽ
 * �ŵ㣺����һֱռ��ϵͳ��Դ��ʵ�����ӳټ���
 * ȱ�㣺���봦��ö��߳�ͬʱ�������⡢����Ҳ���ܵ�һ��Ӱ��
 * @author Administrator
 *
 */
public class LazySingleton {
	
	private static LazySingleton instance = null;
	
	private LazySingleton() {
		
	}
	
	/**
	 * �߳�����
	 * �����������󽵵�ϵͳ����
	 * @return
	 */
	/*synchronized public static LazySingleton getInstance() {
		if(instance == null) {
			return new LazySingleton();
		}
		return instance;
	}*/
	
	/**
	 * �Ľ�
	 * ֻ�����������
	 * ȱ�㣺 ����߳�A��Bͬʱ���ø÷������ж�������������������ʵ����Υ������ģʽ���˼��
	 * @return
	 */
	/*public static LazySingleton getInstance() {
		if(instance == null) {
			synchronized (LazySingleton.class) {	// �ź���
				instance = new LazySingleton();
			}
		}
		return instance;
	}*/
	
	/**
	 * �ٸĽ�
	 * ˫�ؼ������
	 * @return
	 */
	public static LazySingleton getInstance() {
		if(instance == null) {	// ��һ���ж�
			synchronized (LazySingleton.class) {
				if(instance == null) {	// �ڶ����ж�
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
	
	

}
