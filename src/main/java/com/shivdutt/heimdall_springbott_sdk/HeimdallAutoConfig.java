package com.shivdutt.heimdall;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.shivdutt.heimdall")
public class HeimdallAutoConfig {
    // This enables auto-registration of PingController
}
