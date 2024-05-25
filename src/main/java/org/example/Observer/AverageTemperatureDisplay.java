package org.example.Observer;

public class AverageTemperatureDisplay implements Observer {
    private int temperatureSum = 0;
    private int numReadings = 0;
    private Observable weatherStation;

    public AverageTemperatureDisplay(Observable weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        temperatureSum += temperature;
        numReadings++;
        display();
    }

    public void display() {
        System.out.println("Average temperature: " + (temperatureSum / numReadings) + "C degrees");
    }
}
