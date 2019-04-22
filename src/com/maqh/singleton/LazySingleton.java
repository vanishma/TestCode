package com.maqh.singleton;

/**
 * LazySingleton class
 * 懒汉式（线程不安全）
 * 优点:实现了懒加载,避免了资源的浪费
 * 缺点:线程不安全,在多线程的情况下当一个线程执行到1处的时候,
 *     还没有来得及往下执行另一个线程也到1处这样两个线程同时执行2处代码,破坏了单例
 *
 * @author maqh
 * @date 2019/4/22
 */
public class LazySingleton {

    private static LazySingleton INSTANCE = null;

    //私有化构造函数,防止外部实例化
    private LazySingleton(){
    }

    public static LazySingleton getInstance(){
        if (null == INSTANCE){ //1
            INSTANCE = new LazySingleton();//2
        }
        return INSTANCE;
    }


}
