/*
 * MonitoringConfiguration.java
 *
 * (c) Copyright AUDI AG, 2021
 * All Rights reserved.
 *
 * AUDI AG
 * 85057 Ingolstadt
 * Germany
 */
package de.apnmt.common.config;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MonitoringConfiguration {

    @Bean
    public TimedAspect timedAspect(MeterRegistry registry) {
        return new TimedAspect(registry);
    }

}
