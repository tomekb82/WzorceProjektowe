package observer;

/**
 * Created by tomek on 15.08.16.
 */
public class StatisticsDisplay implements Observer {

    private Subject weatherData;
    private float humidity;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(StateParams params) {
        this.humidity = params.getHumidity();
        display();
    }

    public void display(){
        System.out.println("Statistics humidity: " + humidity);
    }
}
