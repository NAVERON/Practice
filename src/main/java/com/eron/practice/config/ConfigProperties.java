package com.eron.practice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ConfigurationProperties(prefix = "spring.auth0.jwt") 
public class ConfigProperties {
	
	public Long tokenValidity;  // com.eron.secret 
	public String tokenHead;  // com.eron.test 
	public String tokenPrefix;  // com.eron.user-name 
	public String tokenSecret;
	
	
}










