package SingletonEager;

public final class SingletonEager {

    private static final SingletonEager eagerInstance = new SingletonEager();

    public SingletonEager() {
    }

    public static SingletonEager getEagerInstance() {
        return eagerInstance;
    }
}
