package vertx.fun.proxy;

/**
 * @author HeCG
 * @description xxx
 * @date 2022/12/12 10:42
 * @since 1.0
 */
public class CountServiceImpl implements CountService {

    private int count = 0;

    @Override
    public int count() {
        return count++;
    }

}
