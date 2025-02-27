package com.smartoffice.environmentcontrol.producer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class EnvironmentControlProducerActivator implements BundleActivator {

	private ServiceRegistration<EnvironmentControlService> registration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Environment Control Producer Bundle starting...");
		
		EnvironmentControlService controlService = new EnvironmentControlServiceImpl();
		registration = context.registerService(EnvironmentControlService.class, controlService, null);
		System.out.println("EnvironmentControlService registered with desired light level = " + controlService.getDesiredLightLevel() + " lux.");
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Environment Control Producer Bundle stopping...");
		registration.unregister();
		
	}

	

}
