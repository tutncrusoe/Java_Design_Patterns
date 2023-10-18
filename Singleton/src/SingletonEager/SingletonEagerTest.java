package SingletonEager;

public class SingletonEagerTest {

    public static void main(String[] args) {

        SingletonEager singletonEager1 = SingletonEager.getEagerInstance();
        SingletonEager singletonEager2 = SingletonEager.getEagerInstance();

        System.out.println(singletonEager1);
        System.out.println(singletonEager2);
    }
}
