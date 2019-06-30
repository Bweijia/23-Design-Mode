package main.java.Singleton;

/**
 * 单例模式--双检锁
 *  锁粒度减小
 */
public class Singleton3 {

    private volatile static Singleton3 instance = null;

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if(instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    private Singleton3() {

    }

}
