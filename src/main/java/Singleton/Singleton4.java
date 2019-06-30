package main.java.Singleton;

/**
 * 单例模式--内部静态类
 */
public class Singleton4 {

    private static class Singleton4Instance {
        private static final Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return Singleton4Instance.instance;
    }

    private Singleton4() {

    }

}
