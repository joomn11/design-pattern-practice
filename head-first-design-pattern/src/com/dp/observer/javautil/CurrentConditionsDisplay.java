package com.dp.observer.javautil;

import java.util.Observable;
import java.util.Observer;

import com.dp.observer.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	Observable observable;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}

	}

	@Override
	public void display() {
		System.out.println("Current Condition : " + temperature + " F degrees , " + humidity + " % humidity");
	}

}
