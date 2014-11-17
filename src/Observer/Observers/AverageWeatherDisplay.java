package Observer.Observers;

import Observer.Subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Display showing average values for Weather Data.
 */
public class AverageWeatherDisplay  implements Observer, DisplayElement{
    private int numberOfUpdates;
    private int avgTemperature;
    private int avgHumidity;
    private int avgPressure;

    /**
     * Creates display for Average Weather Data, receives observable providing data and registers with it.
     * @param weatherData - weather station providing data
     */
    public AverageWeatherDisplay(Observable weatherData) {
        weatherData.addObserver(this);
    }

    /**
     * Displaying average data.
     */
    @Override
    public void display() {
        System.out.println("Average Weather: " + avgTemperature + " C degrees, " + avgHumidity + " %, " + avgPressure + " bars");
    }

    /**
     * Main method called by observable, data is pulled from observable using it getters,
     * average values calculated depending on number of updates, method display() is called at the end.
     * @param obs - object making notifications
     * @param arg - optional argument to push to the Observers
     */
    @Override
    public void update(Observable obs, Object arg) {
        numberOfUpdates++;
        if(obs instanceof WeatherData){
            WeatherData weatherSource = (WeatherData) obs;
            this.avgTemperature = (avgTemperature + weatherSource.getTemperature()) / numberOfUpdates;
            this.avgHumidity = (avgHumidity + weatherSource.getHumidity()) / numberOfUpdates;
            this.avgPressure = (avgPressure + weatherSource.getHumidity()) / numberOfUpdates;
        }
        display();
    }
}
