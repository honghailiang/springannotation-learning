package com.jtt.hhl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.jtt.hhl.bean.Person;

//ʹ��@PropertySource��ȡ�ⲿ�����ļ��е�k/v���浽���еĻ���������;�������ⲿ�������ļ��Ժ�ʹ��${}ȡ�������ļ���ֵ
@PropertySource(value={"classpath:/person.properties"})
@Configuration
public class MainConfigOfPropertyValues {
	
	@Bean
	public Person person(){
		return new Person();
	}

}
