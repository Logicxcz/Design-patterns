package com.dong.patterns.creational.builder;

/**
 * Ӣ�۽�ɫ�����������彨����
 */
public class HeroBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("Ӣ��");
    }

    @Override
    public void buildSex() {
        // TODO Auto-generated method stub
        actor.setSex("��");
    }

    @Override
    public void buildFace() {
        // TODO Auto-generated method stub
        actor.setFace("Ӣ��");
    }

    @Override
    public void buildCostume() {
        // TODO Auto-generated method stub
        actor.setCostume("����");
    }

    @Override
    public void buildHairstyle() {
        // TODO Auto-generated method stub
        actor.setHairstyle("Ʈ��");
    }

   

}