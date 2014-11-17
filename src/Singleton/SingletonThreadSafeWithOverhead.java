package Singleton;

/**
 * Use if multi threading overhead is not an issue
 */
public class SingletonThreadSafeWithOverhead {
    private static SingletonThreadSafeWithOverhead singleton;

    private SingletonThreadSafeWithOverhead() {
    }

    public static synchronized SingletonThreadSafeWithOverhead getSingleton(){
        if(singleton == null){
            singleton = new SingletonThreadSafeWithOverhead();
        }
        return singleton;
    }
}
