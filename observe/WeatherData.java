package observe;

import java.util.ArrayList;

/**
 * Created by kaling on 12/23/15.
 * 观察者模式的实例
 * 天气数据对象,获取并提供天气服务资料
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0){
            //如果链表中存在,就把它删除
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer tempObserver : observers){
            tempObserver.update(temperature, humidity, pressure);
        }
    }
    
    public void measurementChanged(){
        notifyObservers();
    }
    
    public void setMeasureMents(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
