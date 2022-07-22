package ro.fasttrackit.tema10exerc1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "routes")
public record RouteEntity(@Id String Id, LocationEntity start, LocationEntity destination, Double length, TrainEntity train)
{
//    public Route(Location start, Location destination, Double length, TrainEntity train)
//    {
//        this.start = start;
//        this.destination = destination;
//        this.length = length;
//        this.train = train;
//    }
//
//    public Route()
//    {
//        this(new Location(), new Location(), 0.0, new TrainEntity());
//    }
//
//    public Long getId() { return this.id; }
//    public Location getStart() { return this.start; }
//    public Location getDestination() { return this.destination; }
//    public Double getLength() { return this.length; }
//    public TrainEntity getTrain() { return this.train; }
//
//    public void setId(Long id) { this.id = id; }
//    public void setStart(Location start) { this.start = start; }
//    public void setDestination(Location destination) { this.destination = destination; }
//    public void setLength(Double length) { this.length = length; }
//    public void setTrain(TrainEntity train) { this.train = train; }
}
