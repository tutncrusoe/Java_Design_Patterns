package SingletonThreadSafe.impl;

public final class SingletonThreadSafeExample {
    private static SingletonThreadSafeExample singletonThreadSafe;

    public SingletonThreadSafeExample() {

        try {
            System.out.println("Initializing by thread: " + Thread.currentThread().getName());

            Thread.sleep(1000);

            System.out.println("Initialized: " + Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static SingletonThreadSafeExample getInstance() {
        if (singletonThreadSafe == null) {
            synchronized (SingletonThreadSafeExample.class) {
                if (singletonThreadSafe == null) {
                    singletonThreadSafe = new SingletonThreadSafeExample();
                }
            }
        }
        return singletonThreadSafe;
    }
}
