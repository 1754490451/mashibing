package com.example.singleton;


/**
 * 饱汉式（懒加载）
 *
 *  优点：能够根据实际需求初始化
 *  缺点：非线程安全
 */
public class Lazy {

    // 成员变量 线程共享，多线程调用getInstance的时候可能会创建两个实例
    private static Lazy instance;

    // 私有化构造方法
    private Lazy(){

    };

    public static Lazy getInstance(){
        if (instance == null){
            instance = new Lazy();
        }
        return instance;
    }


    public static void main(String[] args) {
        for (int i = 0; i <100; i++) {
            new Thread(()-> System.out.println(Lazy.getInstance().hashCode())).start();
        }
    }


}
