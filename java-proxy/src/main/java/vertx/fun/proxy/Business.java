package vertx.fun.proxy;

/**
 * @author HeCG
 * @description xxx
 * @date 2022/12/12 12:55
 * @since 1.0
 */
public class Business implements IBusiness,IBusiness2 {

    @Override
    public boolean doSomeThing() {
        System.out.println("执行业务逻辑");
        return true;
    }

    @Override
    public void doSomeThing2() {
        System.out.println("执行业务逻辑2");
    }

}
