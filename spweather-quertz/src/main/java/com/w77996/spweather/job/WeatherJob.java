package com.w77996.spweather.job;


import com.w77996.spweather.service.CityDataService;
import com.w77996.spweather.service.WeatherDataService;
import com.w77996.spweather.vo.City;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

@Slf4j
public class WeatherJob extends QuartzJobBean {
    @Autowired
    private CityDataService cityDataService;

    @Autowired
    private WeatherDataService weatherDataService;
    /* (non-Javadoc)
     * @see org.springframework.scheduling.quartz.QuartzJobBean#executeInternal(org.quartz.JobExecutionContext)
     */
    @Override
    protected void executeInternal(JobExecutionContext context)  {
        log.info("Weather Data Sync Job. Start！");
        // 获取城市ID列表
        List<City> cityList = null;

        try {
            cityList = cityDataService.listCity();
        } catch (Exception e) {
            log.error("Exception!", e);
        }

        // 遍历城市ID获取天气
        for (City city : cityList) {
            String cityId = city.getCityId();
            log.info("Weather Data Sync Job, cityId:" + cityId);

            weatherDataService.syncDateByCityId(cityId);
        }

        log.info("Weather Data Sync Job. End！");
    }
}
