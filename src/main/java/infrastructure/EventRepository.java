package infrastructure;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;

import api.interfaces.Repository;

public class EventRepository implements Repository
{
	@Override
	public JsonNode getAll()
	{
		return new RestTemplate()
				.getForObject( baseUrl + "244400404_agenda-evenements-nantes-nantes-metropole&rows=100",
						JsonNode.class )
				.get( "records" );
	}

}
