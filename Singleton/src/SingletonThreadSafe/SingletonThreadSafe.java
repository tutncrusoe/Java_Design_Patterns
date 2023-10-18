package SingletonThreadSafe;

public final class SingletonThreadSafe {

    private static SingletonThreadSafe singletonThreadSafe;

    private SingletonThreadSafe() {
    }

    public static SingletonThreadSafe getInstance() {
        if (singletonThreadSafe == null) {
            synchronized (SingletonThreadSafe.class) {
                if (singletonThreadSafe == null) {
                    singletonThreadSafe = new SingletonThreadSafe();
                }
            }
        }
        return singletonThreadSafe;
    }
}
