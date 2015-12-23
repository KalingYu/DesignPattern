package observe;

/**
 * Created by kaling on 12/23/15.
 * 测试程序
 * 用来测试观察者模式
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrrentConditionsDisplay currrentConditionsDisplay = new CurrrentConditionsDisplay(weatherData);
        weatherData.setMeasureMents(23,234,34);
    }
}
