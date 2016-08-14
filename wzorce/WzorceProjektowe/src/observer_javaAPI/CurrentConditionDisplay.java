package observer_javaAPI;

import observer.Observer;
import observer.StateParams;
import observer.Subject;

import java.util.Observable;

/**
 * Created by tomek on 15.08.16.
 */
public class CurrentConditionDisplay implements java.util.Observer {

    private Observable weatherData;
    private float temperature;

    public CurrentConditionDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void display(){
        System.out.println("Current conditions: " + temperature);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            if(weatherData.getParams() != null) {
                this.temperature = weatherData.getParams().getTemperature();
            }
            display();
        }
    }
}
