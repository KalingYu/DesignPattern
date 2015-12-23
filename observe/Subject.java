package observe;

/**
 * Created by kaling on 12/23/15.
 * 监听的服务器,提供监听的主题
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);

    /**
     * 通知链表中的所有对象
     */
    public void notifyObservers();
}
