package com.dong.patterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ���ؾ�����
 * @author Administrator
 *
 */
public class LoadBalancer {

	private static LoadBalancer instance = null;
	private List serverList = null;
	
	// ˽�й��췽��
	private LoadBalancer() {
		serverList = new ArrayList<>();
	}
	
	/**
	 * ���о�̬��Ա����������Ψһʵ��
	 * @return
	 */
	public static LoadBalancer getLoadBalancer() {
		if(instance == null) {
			return new LoadBalancer();
		}
		return instance;
	}
	
	/**
	 * ���ӷ�����
	 * @param server
	 */
	public void addServer(String server) {
		serverList.add(server);
	}
	
	/**
	 * ɾ��������
	 * @param server
	 */
	public void removeServer(String server) {
		serverList.remove(server);
	}
	
	/**
	 * ������ط�����
	 * @return
	 */
	public String getServer() {
		Random random = new Random();
		int i = random.nextInt(serverList.size());
		return (String)serverList.get(i);
		
	}
	
}
