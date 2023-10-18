package SingletonLazy;

public class SingletonLazyTest {

    public static void main(String[] args) {

        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();

        System.out.println(singletonLazy1);
        System.out.println(singletonLazy2);
    }
}
