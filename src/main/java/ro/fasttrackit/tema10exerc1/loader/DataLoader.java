package ro.fasttrackit.tema10exerc1.loader;

import org.springframework.boot.CommandLineRunner;
import ro.fasttrackit.tema10exerc1.model.LocationEntity;
import ro.fasttrackit.tema10exerc1.model.RouteEntity;
import ro.fasttrackit.tema10exerc1.model.TrainEntity;
import ro.fasttrackit.tema10exerc1.repository.LocationRepository;
import ro.fasttrackit.tema10exerc1.repository.RouteRepository;
import ro.fasttrackit.tema10exerc1.repository.TrainRepository;

import static java.util.UUID.randomUUID;

public class DataLoader implements CommandLineRunner
{
    private final LocationRepository locationRepository;
    private final RouteRepository routeRepository;
    private final TrainRepository trainRepository;

    public DataLoader(LocationRepository locationRepository,
                      RouteRepository routeRepository,
                        TrainRepository trainRepository)
    {
        this.locationRepository = locationRepository;
        this.routeRepository = routeRepository;
        this.trainRepository = trainRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        LocationEntity location1 = new LocationEntity(randomUUID().toString(), "Bucuresti");
        LocationEntity location2 = new LocationEntity(randomUUID().toString(), "Constanta");
        LocationEntity location3 = new LocationEntity(randomUUID().toString(), "Cluj-Napoca");
        LocationEntity location4 = new LocationEntity(randomUUID().toString(), "Iasi");

        locationRepository.save(location1);
        locationRepository.save(location2);
        locationRepository.save(location3);
        locationRepository.save(location4);

        TrainEntity train1 = new TrainEntity(randomUUID().toString(), "Clasa 40", 10, location1);
        TrainEntity train2 = new TrainEntity(randomUUID().toString(), "Clasa 41", 8, location2);
        TrainEntity train3 = new TrainEntity(randomUUID().toString(), "Clasa 60", 9, location3);
        TrainEntity train4 = new TrainEntity(randomUUID().toString(), "Clasa 62", 9, location4);

        trainRepository.save(train1);
        trainRepository.save(train2);
        trainRepository.save(train3);
        trainRepository.save(train4);

        RouteEntity route1 = new RouteEntity(randomUUID().toString(), location1, location2, 225.0, train1);
        RouteEntity route2 = new RouteEntity(randomUUID().toString(), location2, location1, 225.0, train2);
        RouteEntity route3 = new RouteEntity(randomUUID().toString(), location3, location1, 391.0, train3);
        RouteEntity route4 = new RouteEntity(randomUUID().toString(), location4, location2, 452.0, train4);

        routeRepository.save(route1);
        routeRepository.save(route2);
        routeRepository.save(route3);
        routeRepository.save(route4);
    }
}
