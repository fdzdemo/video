package com.zhiyou.config;

import java.util.Properties;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import com.github.pagehelper.PageHelper;

@SpringBootConfiguration
public class MybatisConfig {

	@Bean
	public PageHelper pageHelper() {
		PageHelper p=new PageHelper();
		Properties per=new Properties();
		per.setProperty("offsetAspageNum", "true");
		per.setProperty("rowBoundsWithCount", "true");
		per.setProperty("reasonable", "true");
		p.setProperties(per);
		return p;
}
}