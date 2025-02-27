package com.smartoffice.environmentcontrol.producer;

import java.util.Random;

public class EnvironmentControlServiceImpl implements EnvironmentControlService {

	private Random random = new Random();
	
	@Override
	public String adjustEnvironment() {
		
		// Simulate a dynamic environment adjustment message
		double adjustmentFactor = random.nextDouble();
		
		if (adjustmentFactor < 0.5) {
			return "Adjusting environment: Lowering temperature and diming lights.";
		} else {
			return "Adjusting environment: Raising temperature and increasing ventilation";
		}
	}

	@Override
	public double getDesiredLightLevel() {
		
		// Simulate a dynamic desired light level between 350 and 450 lux.
		double lux = 350 + random.nextDouble() * 100;
		
		return  Math.round(lux * 100.0) /100.0;
	}
	

}
