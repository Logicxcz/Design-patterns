package com.dong.patterns.behavioral.mediator;
/**
 * 
 * @ClassName: Client 
 * @Description: �н���ģʽ
 * @author: dong
 * @date: 2018��11��23�� ����12:02:02 
 * @keyword: 
 *
 */
public class Client {

    public static void main(String[] args) {
        // �����н��߶���
        ConcreteMediator mediator;
        mediator = new ConcreteMediator();
        
        // ����ͬ�¶���
        Button addBT = new Button();
        MyList myList = new MyList();
        ComboBox cb = new ComboBox();
        TextBox userNameTB = new TextBox();
        
        addBT.setMediator(mediator);
        myList.setMediator(mediator);
        cb.setMediator(mediator);
        userNameTB.setMediator(mediator);
        
        mediator.addButton = addBT;
        mediator.myList = myList;
        mediator.cb = cb;
        mediator.userNameTextBox = userNameTB;
        
        addBT.changed();
        System.out.println("===================");
        myList.changed();
        
    }

}
