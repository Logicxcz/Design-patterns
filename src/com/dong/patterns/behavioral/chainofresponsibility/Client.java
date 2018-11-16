package com.dong.patterns.behavioral.chainofresponsibility;
/**
 * 
 * @ClassName: Client 
 * @Description: �ͻ���
 * @author: dong
 * @date: 2018��11��16�� ����11:17:06 
 * @keyword: ����ְ����ģʽ
 *
 */
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Approver zhangsan,lisi,wangwu,congressA;
        zhangsan = new Director("����");
        lisi = new VicePresident("����");
        wangwu = new President("����");
        congressA = new Congress("���»�A");
        
        // ����ְ����
        zhangsan.setSuccessor(lisi);
        lisi.setSuccessor(wangwu);
        wangwu.setSuccessor(congressA);
        
        // �����ɹ���
        PurchaseRequest pr1 = new PurchaseRequest(2000.0d, 1, "�����ӡ��");
        zhangsan.processRequest(pr1);
        
        PurchaseRequest pr2 = new PurchaseRequest(60000.0d, 2, "�ɹ�����");
        zhangsan.processRequest(pr2);
        
        PurchaseRequest pr3 = new PurchaseRequest(160000.0d, 3, "�����Ʒ�����");
        zhangsan.processRequest(pr3);
        
        PurchaseRequest pr4 = new PurchaseRequest(50000000.0d, 4, "������");
        zhangsan.processRequest(pr4);
        
    }

}
