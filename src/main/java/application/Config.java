package application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import domain.Service;

@Configuration
public class Config
{
	@Bean
	public Service getService()
	{
		return new Service();
	}
}
