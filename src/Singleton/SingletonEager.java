package Singleton;

/**
 * Singleton with eager creation, also solves multi threading problem
 */
public class SingletonEager {
    private static SingletonEager singletonEager = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getSingleton(){
        return singletonEager;
    }
}
