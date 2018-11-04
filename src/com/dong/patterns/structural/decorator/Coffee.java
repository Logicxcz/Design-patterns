package com.dong.patterns.structural.decorator;
/**
 * 
 * @ClassName: Coffee 
 * @Description: ĳ���ȵ���������ʱ�����Ը��ݹ˿͵�Ҫ�������м���������ϣ�
 *              ���ȵ������������������������á����ȵ�����Ӧ�Ŀ��ȼ����ϵ�����ͼ۸����£�
 *              ��������������������������������������������������������������������������������������������������������������������������
 *              |     ����                              |   �۸�/�� ($) |      ����          | �۸�/��($) |
 *              |  ����(Espresso)     |   25        | Ħ��(Mocha)  |  10      |
 *              |��Ⱥ決����(DarkRoast)|   20        | ����(Whip)   |   8      |
 *              ��������������������������������������������������������������������������������������������������������������������������
 * @author: dong
 * @date: 2018��11��4�� ����12:40:30 
 * @keyword: 
 *
 */
public class Coffee {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());
        
    }

}
