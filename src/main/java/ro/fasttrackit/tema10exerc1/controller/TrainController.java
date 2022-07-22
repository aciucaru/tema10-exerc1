package ro.fasttrackit.tema10exerc1.controller;

import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.tema10exerc1.model.TrainEntity;
import ro.fasttrackit.tema10exerc1.service.TrainService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("trains")
public class TrainController
{
    private final TrainService service;

    @GetMapping("{id}")
    public Optional<TrainEntity> getById(@PathVariable String id)
    {
        Optional<TrainEntity> optTrain = Optional.ofNullable(null);
        if(id != null)
            optTrain = service.getById(id);
        return optTrain;
    }

    @GetMapping
    public List<TrainEntity> getAll() { return service.getAll(); }

    @GetMapping
    public List<TrainEntity> getAllBy()
    {
        return service.getAll();
    }

    @PostMapping
    public Optional<TrainEntity> add(@RequestBody TrainEntity train)
    {
        Optional<TrainEntity> optTrain = service.add(train);
        return optTrain;
    }

    @DeleteMapping("{id}")
    public Optional<TrainEntity> delete(@PathVariable String id)
    {
        Optional<TrainEntity> optTrain = Optional.ofNullable(null);
        if(id != null)
            optTrain = service.delete(id);
        return optTrain;
    }
}
