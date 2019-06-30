package main.java.Singleton;

/**
 * 单例模式--懒汉模式
 * 懒加载 线程不安全 不能防止反射构建新对象
 */
public class Singleton2 {
    private  static Singleton2 instance = null;

    private Singleton2() {
    }

    public static Singleton2 getInstance(){
        if (instance==null){
             instance= new Singleton2();
        }
        return instance;
    }


}
