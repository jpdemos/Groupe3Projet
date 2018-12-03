package application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.entities.Event;
import domain.Service;

@EnableAutoConfiguration
@ComponentScan
@RestController
public class ExposedServices
{
	@Autowired
	Service service;

	@RequestMapping( "/Events" )
	List< Event > events() throws Exception
	{
		return service.getAllEvents();
	}

}
