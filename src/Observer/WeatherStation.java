package Observer;

import Observer.Observers.*;
import Observer.Subject.WeatherData;
import java.util.Observer;

/**
 * Weather Station simulation
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherStation = new WeatherData();
        Observer averageWeatherDisplay = new AverageWeatherDisplay(weatherStation);
        Observer forecastWeatherDisplay = new ForecastWeatherDisplay(weatherStation);
        Observer currentWeatherDisplay = new CurrentWeatherDisplay(weatherStation);
        Observer heatIndexDisplay = new HeatIndexDisplay(weatherStation);

        weatherStation.randomlySetMeasurements();
        weatherStation.randomlySetMeasurements();
        weatherStation.randomlySetMeasurements();
    }
}
