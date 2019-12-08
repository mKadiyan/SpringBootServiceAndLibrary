package com.example.multimodule.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

@ConfigurationProperties("service")
public class ServiceProperties {

	/**
	 * A message for the service.
	 */
	private String message;

	private String url;

	public String getMessage() {
		return message;
	}

	public String getUrlData(){
		return new RestTemplate().getForEntity(this.url, String.class).getBody();
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
