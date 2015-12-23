package observe;

/**
 * Created by kaling on 12/23/15.
 * 提供展示的模板,任何一个展示面板的继承接口
 */
public interface DisplayElement {
    /**
     * 任何面板需要展示时调用这个接口
     */
    public void display();
}
