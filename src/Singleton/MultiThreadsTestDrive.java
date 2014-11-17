package Singleton;

/**
 * Test drive singleton in multi threads
 */
public class MultiThreadsTestDrive {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(SingletonMultiThreadNoOverhead.getSingleton());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(SingletonMultiThreadNoOverhead.getSingleton());
            }
        });

        thread1.start();
        thread2.start();
    }

}
