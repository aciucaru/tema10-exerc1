package ro.fasttrackit.tema10exerc1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "locations")
public record LocationEntity(@Id String Id, String city)
{

}
