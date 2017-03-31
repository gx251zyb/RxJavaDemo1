package java_rx;

/**
 * Created by Administrator on 2017/3/31.
 */

public interface Watched {
    public void addWatcher(Watcher watcher);
    public void removeWatcher(Watcher watcher);
    public void notiyWatchers(String str);

}
