package observer;

/**
 * Created by tomek on 15.08.16.
 */
public class CurrentConditionDisplay implements Observer {

    private Subject weatherData;
    private float temperature;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(StateParams params) {
        this.temperature = params.getTemperature();
        display();
    }

    public void display(){
        System.out.println("Current conditions: " + temperature);
    }
}
