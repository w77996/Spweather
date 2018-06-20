package com.w77996.spweather.service;

import com.w77996.spweather.vo.WeatherResponse;

public interface WeatherDataService {
	
	WeatherResponse getDataByCityId(String cityId);



	WeatherResponse getDataByCityName(String cityName);

	/**
	 * 根据城市ID来同步天气
	 * @param cityId
	 */
	void syncDateByCityId(String cityId);

}
