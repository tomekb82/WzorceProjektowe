package observer_javaAPI;

import observer.Observer;
import observer.StateParams;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by tomek on 15.08.16.
 */
public class WeatherData extends Observable {

    private StateParams params;

    public WeatherData(){}

    public void measurmentsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasuments(float temperature, float humidity, float pressure){
        params = new StateParams();
        params.setHumidity(humidity);
        params.setPressure(pressure);
        params.setTemperature(temperature);
        measurmentsChanged();
    }

    public StateParams getParams() {
        return params;
    }

    public void setParams(StateParams params) {
        this.params = params;
    }
}
