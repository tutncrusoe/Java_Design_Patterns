package SingletonLazy;

public final class SingletonLazy {

    private static SingletonLazy singletonLazy;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
