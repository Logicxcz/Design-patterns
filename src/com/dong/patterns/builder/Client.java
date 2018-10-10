package com.dong.patterns.builder;
/**
 * �ͻ���
 * @ClassName: Client 
 * @Description: 
 * @author dong 
 * @date Oct 10, 2018 10:21:52 PM 
 * @keywords : 
 *
 */
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ActorBuilder ab;
        ab = (ActorBuilder)XMLUtil.getBean();
        
        ActorController ac = new ActorController();
        Actor actor;
        actor = ac.construct(ab);
        
        String type = actor.getType();
        System.out.println(type + "�����:");
        System.out.println("�Ա�" + actor.getSex());
        System.out.println("����" + actor.getFace());
        System.out.println("����" + actor.getCostume());
        System.out.println("����" + actor.getHairstyle());
    }

}
