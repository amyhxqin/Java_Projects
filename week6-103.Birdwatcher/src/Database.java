
import java.util.ArrayList;


public class Database {
    private ArrayList<Bird> database;
    
    public Database (){
        this.database = new ArrayList<Bird> ();
    }
    
    public void add (Bird bird){
        database.add(bird);
    }
    
    public void addObservation (String birdObserved){
        for(Bird bird : this.database){
                if(bird.getName().equals(birdObserved)){
                    bird.observed();
                }
                else{
                    System.out.println("Is not a bird!");
                }
        }
    }
    
    public void show (String searchedBird) {
        for(Bird bird : this.database){
                if(bird.getName().equals(searchedBird)){
                    System.out.println(bird);
                }
                else{
                    System.out.println("Is not a bird!");
                }
            }
        
    }
    
    public void print () {
        for(Bird bird : this.database){
            System.out.println(bird);
        }
    }
    
}
