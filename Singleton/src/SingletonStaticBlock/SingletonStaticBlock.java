package SingletonStaticBlock;

public final class SingletonStaticBlock {

    private static final SingletonStaticBlock SINGLETON_STATIC_BLOCK;

    static {
        SINGLETON_STATIC_BLOCK = new SingletonStaticBlock();
    }

    public static SingletonStaticBlock getInstance() {
        return SINGLETON_STATIC_BLOCK;
    }
}
