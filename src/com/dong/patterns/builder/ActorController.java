package com.dong.patterns.builder;

/**
 * ��Ϸ��ɫ������������ָ����
 */
public class ActorController {

    /**
     * Default constructor
     */
    public ActorController() {
    }

    /**
     * �𲽹������Ӳ�Ʒ����
     * @param ActorBuilder ab 
     * @return
     */
    public Actor construct(ActorBuilder ab) {
        // TODO implement here
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        actor = ab.createActor();
    
        return actor;
    }

}