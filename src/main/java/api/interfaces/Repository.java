package api.interfaces;

import com.fasterxml.jackson.databind.JsonNode;

public interface Repository
{
	public JsonNode getAll();
}
