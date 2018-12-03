package domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import api.entities.Event;
import api.interfaces.Factory;

public class Service
{
	@Autowired
	Factory factory;

	public List< Event > getAllEvents()
	{
		return factory.getAllEvents();
	}

}
