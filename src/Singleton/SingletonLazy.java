package Singleton;

/**
 * Singleton pattern with lazy instantiation
 */
public class SingletonLazy {
    private static SingletonLazy singleton;

    private SingletonLazy() {
    }

    public static SingletonLazy getSingleton(){
        if(singleton == null){
            singleton = new SingletonLazy();
        }
        return singleton;
    }
}
