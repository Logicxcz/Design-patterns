package com.dong.patterns.creational.builder;

/**
 * ��ʹ��ɫ�����������彨����
 */
public class AngelBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        // TODO Auto-generated method stub
        actor.setType("��ʹ");
    }

    @Override
    public void buildSex() {
        // TODO Auto-generated method stub
        actor.setSex("Ů");
    }

    @Override
    public void buildFace() {
        // TODO Auto-generated method stub
        actor.setFace("Ư��");
    }

    @Override
    public void buildCostume() {
        // TODO Auto-generated method stub
        actor.setCostume("��ȹ");
    }

    @Override
    public void buildHairstyle() {
        // TODO Auto-generated method stub
        actor.setHairstyle("���糤��");
    }

   

}