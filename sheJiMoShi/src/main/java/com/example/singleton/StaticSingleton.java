package com.example.singleton;


/**
 * 静态内部类方式
 * JVM保证单例（jvm加载类只会加载一次）
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class StaticSingleton {
    // 私有化构造器
    private StaticSingleton(){
    }
    // 静态内部类，在调用方法的时候才会加载
    private static class StaticSingletonHolder{
        private final static StaticSingleton INSTANCE = new StaticSingleton();
    }
    // 静态方法，给外部提供获取实例的方法
    public static StaticSingleton getInstance(){
        return StaticSingletonHolder.INSTANCE;
    }
}
