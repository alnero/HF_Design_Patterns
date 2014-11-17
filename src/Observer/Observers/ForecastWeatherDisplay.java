package Observer.Observers;

import Observer.Subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Display showing forecasts, depending on the received data.
 */
public class ForecastWeatherDisplay implements Observer, DisplayElement{
    private int prevTemperature;
    private int prevHumidity;
    private int prevPressure;
    private int currTemperature;
    private int currHumidity;
    private int currPressure;

    /**
     * Creates display for Forecasts, receives observable providing data and registers with it
     * @param weatherData - weather station providing data
     */
    public ForecastWeatherDisplay(Observable weatherData) {
        weatherData.addObserver(this);
    }

    /**
     * Displaying forecast
     */
    @Override
    public void display() {
        StringBuilder forecast = new StringBuilder();
        forecast.append("Weather forecast: ");
        if(prevTemperature < currTemperature){
            forecast.append("it will be warmer, ");
        } else {
            forecast.append("it will be colder, ");
        }

        if(prevHumidity < currHumidity){
            forecast.append("it will rain, ");
        } else {
            forecast.append("it won't rain, ");
        }

        if(prevPressure < currPressure){
            forecast.append("expect good weather. ");
        } else {
            forecast.append("bad weather coming.");
        }

        System.out.println(forecast.toString());
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
            this.prevTemperature = this.currTemperature;
            this.currTemperature = weatherSource.getTemperature();

            this.prevHumidity = this.currHumidity;
            this.currHumidity = weatherSource.getHumidity();

            this.prevPressure = this.currPressure;
            this.currPressure = weatherSource.getPressure();
        }
        display();
    }
}
