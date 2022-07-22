package ro.fasttrackit.tema10exerc1.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.tema10exerc1.model.LocationEntity;
import ro.fasttrackit.tema10exerc1.model.TrainEntity;
import ro.fasttrackit.tema10exerc1.repository.TrainDAO;
import ro.fasttrackit.tema10exerc1.repository.TrainRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TrainService
{
    private final TrainRepository repository;
    private final TrainDAO dao;

    public TrainService(TrainRepository repository, TrainDAO dao)
    {
        this.repository = repository;
        this.dao = dao;
    }

    public Optional<TrainEntity> getById(String id)
    {
        Optional<TrainEntity> optTrain = Optional.ofNullable(null);
        if(id != null)
            optTrain = repository.findById(id);
        return optTrain;
    }

    public List<TrainEntity> getAll() { return repository.findAll(); }

    public List<TrainEntity> getAllBy(LocationEntity location)
    {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is("Eric"));
        List<User> users = mongoTemplate.find(query, User.class);
    }

    public Optional<TrainEntity> add(TrainEntity train)
    {
        Optional<TrainEntity> optTrain = Optional.ofNullable(repository.save(train));
        return optTrain;
    }

    public Optional<TrainEntity> delete(@PathVariable String id)
    {
        Optional<TrainEntity> optTrain = repository.findById(id);
        if(optTrain.isPresent())
            repository.delete(optTrain.get());
        return optTrain;
    }
}
