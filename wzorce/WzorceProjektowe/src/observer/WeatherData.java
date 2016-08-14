package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomek on 15.08.16.
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private StateParams params;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i < 0){
            throw new IllegalArgumentException();
        }
        observers.remove(i);

    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(params));
    }

    public void measurmentsChanged(){
        notifyObservers();
    }

    public void setMeasuments(float temperature, float humidity, float pressure){
        params = new StateParams();
        params.setHumidity(humidity);
        params.setPressure(pressure);
        params.setTemperature(temperature);
        measurmentsChanged();
    }
}
