package observer_javaAPI;

/**
 * Created by tomek on 15.08.16.
 */
public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasuments(80, 65, 30.5f);
        weatherData.setMeasuments(60, 75, 40.5f);
    }
}
