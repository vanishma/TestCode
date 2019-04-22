package com.maqh.singleton;

/**
 * LazySyncSingleton class
 * 4. 懒汉式（加锁）
 *
 * 解决了3线程不安全的问题,利用synchronized 对getInstance()方法加锁以达到同步访问.
 * 优点:线程同步
 * 缺点:效率低下,吃饭时对整个对象加锁,每次访问getInstance()都需要同步访问,这种情况多线程
 *      并发效率非常低下,其实我们只需要在对象还没实例化前加锁就可以了,实例化后就不存在并发问题了.
 * @author maqh
 * @date 2019/4/22
 */
public class LazySyncSingleton {

    private static  LazySyncSingleton INSTANCE = null;

    private LazySyncSingleton(){
    }

    //效率低
    public static synchronized LazySyncSingleton getInstance(){
        if (null == INSTANCE){
            INSTANCE = new LazySyncSingleton();
        }
        return INSTANCE;
    }
}
