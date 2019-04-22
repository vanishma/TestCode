package com.maqh.singleton;

/**
 * EnumsSingleton class
 *
 * @author maqh
 * @date 2019/4/22
 */


public enum EnumsSingleton {
    INSTANCE;

    @SuppressWarnings("unused")
    private void method() {
        System.out.println("------- newInstance");
    }
}

 class tests {
     public static void main(String[] args) {
         System.out.println(EnumsSingleton.INSTANCE);
     }
}

