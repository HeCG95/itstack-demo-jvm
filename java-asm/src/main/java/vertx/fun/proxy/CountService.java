package vertx.fun.proxy;

/**
 * @author HeCG
 * @description xxx
 * @date 2022/12/12 10:41
 * @since 1.0
 */
public interface CountService {

    int count();

    default int count(int a){return a;}

}
