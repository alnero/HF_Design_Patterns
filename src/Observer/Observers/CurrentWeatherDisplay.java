package Observer.Observers;

import Observer.Subject.WeatherData;

import java.util.Observable;
import java.util.Observer;
/**
 * Display showing current weather data
 */
public class CurrentWeatherDisplay implements Observer, DisplayElement{
    private int temperature;
    private int humidity;
    private int pressure;

    /**
     * Creates display for Current Weather Data, receives observable providing data and registers with it
     * @param weatherData - weather station providing data
     */
    public CurrentWeatherDisplay(java.util.Observable weatherData) {
        weatherData.addObserver(this);
    }

    /**
     * Displaying current data.
     */
    @Override
    public void display() {
        System.out.println("Current Weather: " + temperature + " C degrees, " + humidity + " %, " + pressure + " bars");
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
}
