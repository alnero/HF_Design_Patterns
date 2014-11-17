package Singleton;

/**
 * Singleton for multi threading, not adding performance overhead
 */
public class SingletonMultiThreadNoOverhead {
    private static SingletonMultiThreadNoOverhead singleton;

    private SingletonMultiThreadNoOverhead() {
    }

    public static SingletonMultiThreadNoOverhead getSingleton(){
        if(singleton == null){
            synchronized (SingletonMultiThreadNoOverhead.class){
                // double checking is used
                if(singleton == null){
                    singleton = new SingletonMultiThreadNoOverhead();
                }
            }
        }
        return singleton;
    }
}
