package com.iot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration //tells Spring to treat this as a configuration class and register it as a Bean
@EnableConfigurationProperties //tells Spring to treat this class as a consumer of application.yml/properties values
@ConfigurationProperties(prefix="ge.network") //tells Spring what section this class represents
@Data
public class GeNetworkSettings {
	private String proxyHost;
	private String proxyPort;	
}
