package com.dong.patterns.builder;

/**
 * ��ɫ����������������
 */
public abstract class ActorBuilder {

    /**
     * Default constructor
     */
    public ActorBuilder() {
    }

    /**
     * 
     */
    protected Actor actor = new Actor();


    /**
     * @return
     */
    public abstract void buildType();

    /**
     * @return
     */
    public abstract void buildSex();

    /**
     * @return
     */
    public abstract void buildFace();

    /**
     * @return
     */
    public abstract void buildCostume();

    /**
     * @return
     */
    public abstract void buildHairstyle();

    /**
     * ��������������һ����������Ϸ��ɫ����
     * @return
     */
    public Actor createActor() {
        // TODO implement here
        return actor;
    }

}