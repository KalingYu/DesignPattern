package observe;

/**
 * Created by kaling on 12/23/15.
 * 观察者接口,提供给Subject和Observer继承
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
