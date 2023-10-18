package SingletonEager;

public final class SingletonEager {

    private static final SingletonEager EAGER_INSTANCE = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getEagerInstance() {
        return EAGER_INSTANCE;
    }
}
