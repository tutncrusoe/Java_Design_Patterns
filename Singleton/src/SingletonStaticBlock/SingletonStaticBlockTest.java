package SingletonStaticBlock;

import SingletonEager.SingletonEager;

public class SingletonStaticBlockTest {

    public static void main(String[] args) {

        SingletonStaticBlock staticBlock1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock staticBlock2 = SingletonStaticBlock.getInstance();

        System.out.println(staticBlock1);
        System.out.println(staticBlock2);
    }
}
