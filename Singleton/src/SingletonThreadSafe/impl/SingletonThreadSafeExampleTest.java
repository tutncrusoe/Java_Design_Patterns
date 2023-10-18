package SingletonThreadSafe.impl;

public class SingletonThreadSafeExampleTest {

    public static void main(String[] args) {

        final Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(SingletonThreadSafeExample::getInstance);
        }


        for (Thread thread : threads) {
            thread.start();
        }
    }
}
