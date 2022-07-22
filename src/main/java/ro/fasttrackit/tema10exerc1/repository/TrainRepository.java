package ro.fasttrackit.tema10exerc1.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import ro.fasttrackit.tema10exerc1.model.TrainEntity;

public interface TrainRepository extends MongoRepository<TrainEntity, String>
{

}
