package com.maqh.singleton;

/**
 * InnerSingleton class
 *
 * @author maqh
 * @date 2019/4/22
 */
public class InnerSingleton {
    private  InnerSingleton() {
    }

    public static InnerSingleton getInstance() {
        return InnerClassSingleton.INSTANCE;
    }

    private static class InnerClassSingleton{
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }
}
