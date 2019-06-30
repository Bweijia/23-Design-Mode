package main.java.Singleton;

/**
 * creat by BWJ
 */

/**
 * 单例模式--饿汉模式
 * 资源消耗过大
 */
public class Singleton1 {
    private static final Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}


