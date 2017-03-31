package java_rx;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/31.
 */

public class ConcreteWacted implements Watched{
    private List<Watcher> list=new ArrayList<>();
    @Override
    public void addWatcher(Watcher watcher) {
        list.add(watcher);

    }

    @Override
    public void removeWatcher(Watcher watcher) {
        list.remove(watcher);
    }

    @Override
    public void notiyWatchers(String str) {
        for (Watcher watcher:list) {
            watcher.update(str);
        }
    }
}
