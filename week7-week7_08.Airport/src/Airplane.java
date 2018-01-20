
import java.util.ArrayList;


public class Airplane {
    private String id;
    private int capacity;
    private ArrayList<Flight> flightsList;
    
    public Airplane (String id, int capacity){
        this.id = id;
        this.capacity = capacity;
        
        this.flightsList = new ArrayList<Flight> ();
    }
    
    public void addFlight (String departureCode, String destinationCode) {
        this.flightsList.add(new Flight(departureCode, destinationCode));
    }
    
    public String getId () {
        return this.id;
    }
    
    public String toString () {
        return this.id + " (" + this.capacity + " ppl)";
    }
    
    public void printAllFlights () {
        
        for(Flight fl : this.flightsList){
            System.out.println(toString() + " " + fl);
        }
        
    }
    
}
