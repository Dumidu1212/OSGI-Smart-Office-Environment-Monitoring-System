package com.smartoffice.light.consumer;

import com.smartoffice.environmentcontrol.producer.EnvironmentControlService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class LightConsumerActivator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Light Consumer Bundle starting...");
        // Consume EnvironmentControlService from the Environment Control Producer Bundle.
        ServiceReference<EnvironmentControlService> ref = context.getServiceReference(EnvironmentControlService.class);
        if (ref != null) {
            EnvironmentControlService envService = context.getService(ref);
            if (envService != null) {
                double desiredLight = envService.getDesiredLightLevel();
                String adjustment = envService.adjustEnvironment();
                System.out.println("Light Consumer: Received desired light level = " + desiredLight + " lux.");
                System.out.println("Light Consumer: Environment Adjustment Message: " + adjustment);
            } else {
                System.out.println("Light Consumer: EnvironmentControlService instance is null.");
            }
        } else {
            System.out.println("Light Consumer: EnvironmentControlService not available.");
        }
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Light Consumer Bundle stopping...");
    }
}
