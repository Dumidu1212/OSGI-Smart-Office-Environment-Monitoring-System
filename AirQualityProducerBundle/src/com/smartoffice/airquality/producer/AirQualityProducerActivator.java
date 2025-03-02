package com.smartoffice.airquality.producer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class AirQualityProducerActivator implements BundleActivator {

	private ServiceRegistration<AirQualityService> registration;

	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Air Quality Producer Bbundle starting...");
		
		AirQualityService airService = new AirQualityServiceImpl();
		registration = context.registerService(AirQualityService.class, airService, null);
		System.out.println("AirQualityService registered with AQI = " + airService.getAirQualityIndex());
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Air Quality Producer Bundle stopping...");
		registration.unregister();
		
	}

}
