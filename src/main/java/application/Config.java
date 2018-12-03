package application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import api.interfaces.Factory;
import domain.Service;
import infrastructure.EventRepository;
import infrastructure.FactoryImpl;

@Configuration
public class Config
{
	@Bean
	public Service getService()
	{
		return new Service();
	}

	@Bean
	public Factory getFactory()
	{
		return new FactoryImpl();
	}

	@Bean
	public EventRepository getEventRepo()
	{
		return new EventRepository();
	}
}
