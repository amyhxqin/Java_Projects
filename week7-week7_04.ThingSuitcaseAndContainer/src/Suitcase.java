
import java.util.ArrayList;


public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;
    
    public Suitcase (int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }
    
    public void addThing(Thing thing){
        if(totalWeight() + thing.getWeight() <= this.maxWeight){
            this.things.add(thing);
            
        }
        
    }
    
    public String toString(){

        if(this.things.size() > 1){
            return this.things.size() + " things (" + totalWeight () + " kg)";
        }
        else if (this.things.size() == 1){
            return this.things.size() + " thing (" + totalWeight () + " kg)";
        }
        else{
            return " empty (" + totalWeight () + " kg)";
        }
    }
    
    public void printThings () {
        for(Thing obj : this.things){
            System.out.println(obj);
        }
    }
    
    public int totalWeight () {
        int totalWeight = 0;
            
        for(Thing obj : this.things){
            totalWeight += obj.getWeight();
        }
            
        return totalWeight;
    }
    
    public Thing heaviestThing () {
        if(this.things.size() == 0){
            return null;
        }
        else{
            Thing heaviest = this.things.get(0);
            
            for(Thing obj : this.things){
                if(obj.getWeight() > heaviest.getWeight()){
                    heaviest = obj;
                }
            
            }
            
            return heaviest;
        }
    }
}
