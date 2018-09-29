package com.dong.patterns.singleton;

/**
 * �ͻ��˴��룬�������Ը��ؾ�����
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoadBalancer balancer1, balancer2, balancer3, balancer4;
		balancer1 = LoadBalancer.getLoadBalancer();
		balancer2 = LoadBalancer.getLoadBalancer();
		balancer3 = LoadBalancer.getLoadBalancer();
		balancer4 = LoadBalancer.getLoadBalancer();
		
		if(balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
			System.out.println("���ؾ���������Ψһ��");
		}
		
		balancer1.addServer("Server1");
		balancer1.addServer("Server2");
		balancer1.addServer("Server3");
		balancer1.addServer("Server4");
		
		// ģ��ͻ�������ַ�
		for(int i = 0; i< 10; i++) {
			String server = balancer1.getServer();
			System.out.println("�ַ���������������" + server);
		}
		
	}

}
