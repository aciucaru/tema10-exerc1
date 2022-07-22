package ro.fasttrackit.tema10exerc1.repository;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TrainDAO
{
    private final MongoTemplate mongo; // ce rol are??

    public TrainDAO(MongoTemplate mongo) { this.mongo = mongo; }
}
