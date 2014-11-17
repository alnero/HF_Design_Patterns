package Observer.Observers;

import Observer.Subject.WeatherData;

import java.util.Observable;
import java.util.Observer;
/**
 * Display showing Heat Index, how the temperature is actually felt depending on humidity.
 */
public class HeatIndexDisplay implements Observer, DisplayElement{
    private int temperature;
    private int humidity;
    private int pressure;

    /**
     * Creates display for Heat Index, receives observable providing data and registers with it
     * @param weatherData - weather station providing data
     */
    public HeatIndexDisplay(Observable weatherData) {
        weatherData.addObserver(this);
    }

    /**
     * Displaying Heat Index
     */
    @Override
    public void display() {
        System.out.println("Heat index is: " + computeHeatIndex(temperature, humidity));
    }

    /**
     * Main method called by observable, data is pulled from observable using it getters, method display() is called at the end.
     * @param obs - object making notifications
     * @param arg - optional argument to push to the Observers
     */
    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherSource = (WeatherData) obs;
            this.temperature = weatherSource.getTemperature();
            this.humidity = weatherSource.getHumidity();
            this.pressure = weatherSource.getPressure();
        }
        display();
    }

    /**
     * Calculates the heat index using temperature and humidity.
     * @param t - temperature
     * @param rh - humidity
     * @return float heat index
     */
    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }
}
