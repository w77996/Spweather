package com.w77996.spweather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.w77996.spweather.vo.WeatherResponse;

public class WeatherResponseServiceImpl implements WeatherDataService {

	
	private static final String WEATHER_URL = "http://wthrcdn.etouch.cn/weather_mini?";
	
	@Autowired
	private RestTemplate restTemplate;
	@Override
	public WeatherResponse getDataByCityId(String cityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WeatherResponse getDataByCityName(String cityName) {
		// TODO Auto-generated method stub
		return null;
	}

}
