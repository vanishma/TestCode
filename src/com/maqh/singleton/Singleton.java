package com.maqh.singleton;

/**
 * 饿汉式
 *
 * 优点:写法简单,类加载时就实例化了静态变量,避免了线程并发问题
 * 缺点:在类装载过程中就实例化了对象,造成了资源浪费
 * @author maqh
 * @date 2019/4/22
 */
public class Singleton {

    private static final Singleton INSANCE = new Singleton();

    //私有化构造函数,防止外部实例化
    private Singleton(){
    }
    //提供静态外部访问方法
    public static Singleton getInsance(){
        return INSANCE;
    }

}
