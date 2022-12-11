public class DynamicLinkingTest {

    int num = 10;

    public void methodA() {
//        System.out.println("methodA...");
    }

    public void method() {
//        System.out.println("methodB...");
        methodA();
//        num++;
    }

}
