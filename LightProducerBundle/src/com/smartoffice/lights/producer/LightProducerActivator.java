package com.smartoffice.lights.producer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class LightProducerActivator implements BundleActivator {

	private ServiceRegistration<LightService> registration;

	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Light producer Bundle starting...");
		
		LightService lightService = new LightServiceImpl();
		registration = context.registerService(LightService.class, lightService, null);
		System.out.println("LightService registered with ambian light = " + lightService.getAmbientLight() + " lux.");
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Light Producer Bundle stopping...");
		registration.unregister();
		
	}


}
