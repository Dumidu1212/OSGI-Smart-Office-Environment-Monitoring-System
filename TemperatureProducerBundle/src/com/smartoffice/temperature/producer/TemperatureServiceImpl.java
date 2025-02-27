package com.smartoffice.temperature.producer;

import java.util.Random;

public class TemperatureServiceImpl implements TemperatureService {

	private Random random = new Random();
	
	@Override
	public double getTemperature() {
		
		// Adds a dynamic temperature reading between 20 and 25 Celsius
		double temp = 20 + random.nextDouble() * 5;
		
		return Math.round(temp * 100.0) / 100.0;
	}

}
