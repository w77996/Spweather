package com.w77996.spweather.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.w77996.spweather.vo.Weather;
import com.w77996.spweather.vo.WeatherResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class WeatherReportDataServiceImpl implements WeatherReportDataService {

	@Autowired
	private WeatherDataService  weatherDataService;


	public Weather getDataByCityId(String cityId) {
			WeatherResponse resp = weatherDataService.getDataByCityId(cityId);
			return resp.getData();
	}
}


