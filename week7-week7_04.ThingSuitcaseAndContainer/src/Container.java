
import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Container (int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase> ();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(totalWeight() + suitcase.totalWeight() <= this.maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString(){
        if(this.suitcases.size() > 1){
            return this.suitcases.size() + " suitcases (" + totalWeight () + " kg)";
        }
        else if (this.suitcases.size() == 1){
            return this.suitcases.size() + " suitcase (" + totalWeight () + " kg)";
        }
        else{
            return " empty (" + totalWeight () + " kg)";
        }
    }
    
    public int totalWeight () {
        int totalWeight = 0;
            
        for(Suitcase obj : this.suitcases){
            totalWeight += obj.totalWeight();
        }
            
        return totalWeight;
    }
    
    public void printThings() {
        for(Suitcase obj : this.suitcases){
            obj.printThings();
        }
    }
    
    public void clear () {
        this.suitcases.clear();
    }

}
