package com.example.singleton;

/**
 * 枚举方式
 * 不仅解决线程问题，还可以解决反序列化
 */
public enum EnumSingleton {

    INSTANCE;

    // 业务方法
    public void m(){}


    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
    }

}
