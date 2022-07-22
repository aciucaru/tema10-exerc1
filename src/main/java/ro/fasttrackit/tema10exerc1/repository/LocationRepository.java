package ro.fasttrackit.tema10exerc1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ro.fasttrackit.tema10exerc1.model.LocationEntity;

public interface LocationRepository extends MongoRepository<LocationEntity, String>
{

}
