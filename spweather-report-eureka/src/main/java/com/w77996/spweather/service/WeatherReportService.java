package com.w77996.spweather.service;

import com.w77996.spweather.vo.Weather;
import com.w77996.spweather.vo.WeatherResponse;

public interface WeatherReportService {

	Weather getDataByCityId(String cityId);

}
