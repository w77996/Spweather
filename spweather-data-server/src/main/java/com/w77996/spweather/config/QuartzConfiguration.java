package com.w77996.spweather.config;

import com.w77996.spweather.job.WeatherJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfiguration {

    @Bean
    public JobDetail weatherJobDetail(){
        return JobBuilder.newJob(WeatherJob.class).withIdentity("weather").storeDurably().build();
    }

    @Bean
    public Trigger weatherTrigger(){
        return TriggerBuilder.newTrigger().forJob(weatherJobDetail())
                .withIdentity("weatherTrigger")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever()).build();
    }
}
