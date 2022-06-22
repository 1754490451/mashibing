package com.example.singleton;


/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐！
 * 唯一缺点：不管用不用得到，类加载的时候就完成实例化
 *
 */
public class Hungry {
    // 静态变量，在类加载的时候就会赋值
    private static final Hungry INSTANCE = new Hungry();

    // 私有化构方法
    private Hungry() {
    }

    // 对外提供静态方法获取实例
    public static Hungry getInstance(){
        return INSTANCE;
    }


    public static void main(String[] args) {
        Hungry instance1 = Hungry.getInstance();
        System.out.println(Hungry.INSTANCE == instance1);
    }

}
