package java_rx;

/**
 * Created by Administrator on 2017/3/31.
 */
public class ConcreteWacter implements Watcher {
    @Override
    public void update(String str) {
        System.out.println(str);
    }
}
