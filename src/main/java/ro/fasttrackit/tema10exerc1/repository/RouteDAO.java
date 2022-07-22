package ro.fasttrackit.tema10exerc1.repository;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RouteDAO
{
    private final MongoTemplate mongo; // ce rol are??

    public RouteDAO(MongoTemplate mongo) { this.mongo = mongo; }
}
