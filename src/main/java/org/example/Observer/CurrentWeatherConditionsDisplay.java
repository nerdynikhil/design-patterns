package org.example.Observer;

public class CurrentWeatherConditionsDisplay implements Observer {
    private int temperature;
    private int humidity;
    private Observable weatherStation;

    public CurrentWeatherConditionsDisplay(Observable weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "C degrees and " + humidity + "% humidity");
    }
}
