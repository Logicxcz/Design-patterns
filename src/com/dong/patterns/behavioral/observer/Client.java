package com.dong.patterns.behavioral.observer;
/**
 * 
 * @ClassName: Client 
 * @Description: �ͻ���
 * @author: dong
 * @date: 2018��11��18�� ����7:11:58 
 * @keyword: 
 *
 */
public class Client {

    public static void main(String[] args) {
        // ����۲�Ŀ�����
        AllyControlCenter acc;
        acc = new ConcreteAllyControlCenter("��ӹȺ��");
        // ����۲���
        Observer player1, player2, player3, player4;
        
        player1 = new Player("���");
        acc.join(player1);
        
        player2 = new Player("С��Ů");
        acc.join(player2);
        
        player3 = new Player("����");
        acc.join(player3);
        
        player4 = new Player("����");
        acc.join(player4);
        
        player1.beAttacked(acc);
        
    }

}
