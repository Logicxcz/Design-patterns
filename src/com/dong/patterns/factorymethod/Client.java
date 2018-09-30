package com.dong.patterns.factorymethod;

/**
 * 
 * @ClassName: Client 
 * @Description: 
 * @author: dong
 * @date: 2018��9��30�� ����10:05:27 
 * @keyword: 
 *
 */
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * LoggerFactory factory; Logger logger; factory = new FileLoggerFactory();
         * logger = factory.cretaeLogger(); logger.writeLog();
         */

        // ʹ�������ļ�
        LoggerFactory factory;
        Logger logger;
        factory =  (LoggerFactory) XMLUtil.getBean();
        

        /*
         * try {
         * 
         * Class c = Class.forName("com.dong.patterns.factorymethod.FileLoggerFactory");
         * Object obj = c.newInstance(); factory=(LoggerFactory)obj;
         * 
         * logger = factory.createLogger(); logger.writeLog(); } catch
         * (InstantiationException e) { // TODO Auto-generated catch block
         * e.printStackTrace(); } catch (IllegalAccessException e) { // TODO
         * Auto-generated catch block e.printStackTrace(); } catch
         * (ClassNotFoundException e) { // TODO Auto-generated catch block
         * e.printStackTrace(); }
         */

        logger = factory.createLogger();
        logger.writeLog();
    }

}
