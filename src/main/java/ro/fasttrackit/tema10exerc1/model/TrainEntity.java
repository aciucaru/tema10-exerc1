package ro.fasttrackit.tema10exerc1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "trains")
public record TrainEntity(@Id String id, String model, Integer numOfCarts, LocationEntity location)
{
//    public TrainEntity(String model, Integer numOfCarts, Location location)
//    {
//        this.model = model;
//        this.numOfCarts = numOfCarts;
//        this.location = location;
//    }
//
//    public TrainEntity() // constructor fara arg cerut de JPA
//    {
//        this("n/a", 0, new Location());
//    }
//
//    public Long getId() { return this.id; }
//    public String getModel() { return this.model; }
//    public Integer getNumOfCarts() { return this.numOfCarts; }
//    public Location getLocation() { return this.location; }
//
//    public void setId(Long id) { this.id = id; }
//    public void setModel(String model) { this.model = model; }
//    public void setNumOfCarts(Integer numOfCarts) { this.numOfCarts = numOfCarts; }
//    public void setLocation(Location location) { this.location = location; }
}
