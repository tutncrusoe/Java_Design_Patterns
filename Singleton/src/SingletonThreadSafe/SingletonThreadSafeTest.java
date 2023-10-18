package SingletonThreadSafe;

public class SingletonThreadSafeTest {

    public static void main(String[] args) {

        SingletonThreadSafe threadSafe1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe threadSafe2 = SingletonThreadSafe.getInstance();

        System.out.println(threadSafe1);
        System.out.println(threadSafe2);
    }
}
