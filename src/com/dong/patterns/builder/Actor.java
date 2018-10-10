package com.dong.patterns.builder;

/**
 * ��ɫ�ࣺ���Ӳ�Ʒ
 */
public class Actor {

    /**
     * Default constructor
     */
    public Actor() {
    }

    /**
     * ��ɫ����
     */
    private String type;

    /**
     * �Ա�
     */
    private String sex;

    /**
     * ����
     */
    private String face;

    /**
     * ��װ
     */
    private String costume;

    /**
     * ����
     */
    private String hairstyle;

//----------------setter-------------------------------------
    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @param face
     */
    public void setFace(String face) {
        this.face = face;
    }
    
    /**
     * @param costume
     */
    public void setCostume(String costume) {
        this.costume = costume;
    }

    /**
     * @param hairstyle
     */
    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

//----------------getter-------------------------------------
    /**
     * @return
     */
    public String getType() {
        // TODO implement here
        return this.type;
    }

    /**
     * @return
     */
    public String getSex() {
        // TODO implement here
        return this.sex;
    }

    /**
     * @return
     */
    public String getFace() {
        // TODO implement here
        return this.face;
    }
    
    /**
     * @return
     */
    public String getCostume() {
        // TODO implement here
        return this.costume;
    }

    /**
     * @return
     */
    public String getHairstyle() {
        // TODO implement here
        return this.hairstyle;
    }

}