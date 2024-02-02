package org.itstack.demo.design;

/**
 *  枚举单例(线程安全) Effective Java 作者推荐
 */
public enum Singleton_07 {

    INSTANCE;
    public void test(){
        System.out.println("hi~");
    }

}
