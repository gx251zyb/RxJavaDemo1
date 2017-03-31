package java_rx;

/**
 * Created by Administrator on 2017/3/31.
 */

public class Test {
    public static void main(String[] args) {
        Watched xiaoming=new ConcreteWacted();
        Watcher watcher1=new ConcreteWacter();
        Watcher watcher2=new ConcreteWacter();
        Watcher watcher3=new ConcreteWacter();
        xiaoming.addWatcher(watcher1);
        xiaoming.addWatcher(watcher2);
        xiaoming.addWatcher(watcher3);
        xiaoming.notiyWatchers("我要偷东西了");
    }
}
