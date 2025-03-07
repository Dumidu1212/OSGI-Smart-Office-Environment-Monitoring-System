package com.smartoffice.environmentcontrol.consumer;

import com.smartoffice.airquality.producer.AirQualityService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class EnvironmentControlConsumerActivator implements BundleActivator {

	@Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Environment Control Consumer Bundle starting...");
        // Consume AirQualityService from the Air Quality Producer Bundle.
        ServiceReference<AirQualityService> ref = context.getServiceReference(AirQualityService.class);
        if (ref != null) {
            AirQualityService airService = context.getService(ref);
            if (airService != null) {
                int aqi = airService.getAirQualityIndex();
                System.out.println("Environment Control Consumer: Received Air Quality Index = " + aqi);
                if (aqi > 80) {
                    System.out.println("Environment Control Consumer: Alert! Poor air quality detected.");
                } else {
                    System.out.println("Environment Control Consumer: Air quality is acceptable.");
                }
            } else {
                System.out.println("Environment Control Consumer: AirQualityService instance is null.");
            }
        } else {
            System.out.println("Environment Control Consumer: AirQualityService not available.");
        }
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Environment Control Consumer Bundle stopping...");
    }



}
