package org.itstack.demo.design;

/**
 * 饿汉模式(线程安全) 先加载
 */
public class Singleton_03 {

    private static Singleton_03 instance = new Singleton_03();

    private Singleton_03() {
    }

    public static Singleton_03 getInstance() {
        return instance;
    }

}
