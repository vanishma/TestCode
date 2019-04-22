package com.maqh.singleton;

/**
 * 饿汉式
 * 这种方式和上述实现方式基本相同、只是把类实例化的过程放到了静态代码块中来实例化，同样也是在类装载过程执行静态代码块
 * 优缺点基本相同，但是它可以在类实例化过程中做一些额外的操作如异常处理等。
 * @author maqh
 * @date 2019/4/22
 */
public class StaticBlockSingleton {

    private static  StaticBlockSingleton INSTANCE = null;

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public StaticBlockSingleton(){
    }

    // 提供静态外部访问方法
    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}



class test {
    public static void main(String[] args)  {
//        StaticBlockSingleton staticBlockSingleton = new StaticBlockSingleton();
        System.out.println(StaticBlockSingleton.getInstance());
    }
}
