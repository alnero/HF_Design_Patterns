package Observer.Subject;

import java.util.Observable;
import java.util.Random;

/**
 * Weather Data class pulling info from Weather Station and displaying it to screens.
 */
public class WeatherData extends Observable {
    private int temperature;
    private int humidity;
    private int pressure;

    /**
     * Creates a weather data - source of data for displays
     */
    public WeatherData() { }

    /**
     * Pretend that we get new data from Weather Station Device
     */
    public void randomlySetMeasurements(){
        this.humidity = new Random().nextInt(101);
        this.pressure = new Random().nextInt(1071);
        this.temperature = new Random().nextInt(100) - 50;
        setChanged();
        notifyObservers();
    }


    /**
     * Return the most recent measurement for humidity.
     */
    public int getHumidity(){
        return humidity;
    }

    /**
     * Return the most recent measurement for pressure.
     */
    public int getPressure(){
        return pressure;
    }

    /**
     * Return the most recent measurement for temperature.
     */
    public int getTemperature(){
        return temperature;
    }
}
