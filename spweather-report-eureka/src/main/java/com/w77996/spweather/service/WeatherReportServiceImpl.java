package com.w77996.spweather.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.w77996.spweather.vo.Forecast;
import com.w77996.spweather.vo.Weather;
import com.w77996.spweather.vo.WeatherResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class WeatherReportServiceImpl implements WeatherReportService {

	@Override
	public Weather getDataByCityId(String cityId) {
		// TODO 改为由天气数据API微服务来提供
		Weather data = new Weather();
		data.setAqi("81");
		data.setCity("深圳");
		data.setGanmao("容易感冒！多穿衣");
		data.setWendu("22");

		List<Forecast> forecastList = new ArrayList<>();

		Forecast forecast = new Forecast();
		forecast.setDate("25日星期天");
		forecast.setType("晴");
		forecast.setFengxiang("无风");
		forecast.setHigh("高温 11度");
		forecast.setLow("低温 1度");
		forecastList.add(forecast);

		forecast = new Forecast();
		forecast.setDate("26日星期天");
		forecast.setType("晴");
		forecast.setFengxiang("无风");
		forecast.setHigh("高温 11度");
		forecast.setLow("低温 1度");
		forecastList.add(forecast);

		forecast = new Forecast();
		forecast.setDate("27日星期天");
		forecast.setType("晴");
		forecast.setFengxiang("无风");
		forecast.setHigh("高温 11度");
		forecast.setLow("低温 1度");
		forecastList.add(forecast);

		forecast = new Forecast();
		forecast.setDate("28日星期天");
		forecast.setType("晴");
		forecast.setFengxiang("无风");
		forecast.setHigh("高温 11度");
		forecast.setLow("低温 1度");
		forecastList.add(forecast);

		forecast = new Forecast();
		forecast.setDate("29日星期天");
		forecast.setType("晴");
		forecast.setFengxiang("无风");
		forecast.setHigh("高温 11度");
		forecast.setLow("低温 1度");
		forecastList.add(forecast);

		data.setForecast(forecastList);
		return data;
	}

}



