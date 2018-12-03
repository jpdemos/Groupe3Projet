package infrastructure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import api.entities.Event;
import api.interfaces.Factory;

public class FactoryImpl implements Factory
{
	@Autowired
	EventRepository repo;

	@Override
	public List< Event > getAllEvents()
	{
		ObjectMapper	mapper	= new ObjectMapper();
		List< Event >	list	= new ArrayList<>();

		JsonNode nodes = repo.getAll();

		try
		{
			for( JsonNode node : nodes )
				list.add( mapper.readValue( node.findValue( "fields" ).toString(), Event.class ) );
		}
		catch( IOException e )
		{
			e.printStackTrace();
		}

		return list;
	}

}
