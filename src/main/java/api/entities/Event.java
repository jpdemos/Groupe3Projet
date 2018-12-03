package api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties( ignoreUnknown = true )
public class Event
{
	public String nom;

	public String getNom()
	{
		return nom;
	}

	public void setNom( String name )
	{
		this.nom = name;
	}

}
