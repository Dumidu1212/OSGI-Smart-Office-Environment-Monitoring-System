package com.smartoffice.airquality.producer;

import java.util.Random;

public class AirQualityServiceImpl implements AirQualityService {

	private Random random = new Random();
	
	@Override
	public int getAirQualityIndex() {
		
		// Send a dynamic air quality index between 30 and 100
		int index = 30 + random.nextInt(71);
		
		return index;
	}
	

}
