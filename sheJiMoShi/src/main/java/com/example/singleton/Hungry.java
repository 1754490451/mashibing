package com.example.singleton;


/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐！
 * 唯一缺点：不管用不用得到，类加载的时候就完成实例化
 *
 */
public class Hungry {
    private static final Hungry INSTANCE = new Hungry();

    private Hungry() {
    }

    public static Hungry getInstance(){
        return INSTANCE;
    }


    public static void main(String[] args) {
        Hungry instance = Hungry.getInstance();
        Hungry instance1 = Hungry.getInstance();
        System.out.println(instance == instance1);
    }

}
