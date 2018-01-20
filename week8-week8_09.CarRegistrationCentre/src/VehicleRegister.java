
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    private ArrayList<RegistrationPlate> plates;
    
    public VehicleRegister () {
        this.owners = new HashMap<RegistrationPlate, String> ();
        this.plates = new ArrayList<RegistrationPlate> ();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if (this.owners.get(plate) != null) {
            return false;
        }
        
        else {
            this.owners.put(plate, owner);
            this.plates.add(plate);
            return true;
        }
    }
    
    public String get(RegistrationPlate plate){
        if (this.owners.get(plate) != null) {
            return this.owners.get(plate);
        }
        else {
            return null;
        }
    }
    
    public boolean delete(RegistrationPlate plate){
        if(this.owners.get(plate) != null){
            this.owners.remove(plate);
            return true;
        }
        else{
            return false;
        }
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate pl : this.plates){
            System.out.println(pl);
        }
    }
    
    public void printOwners(){
        boolean repeat = true;
        
        for(RegistrationPlate pl : this.plates){
            //System.out.println("o");
            if(Collections.frequency(this.owners.values(), pl) == 1){
                System.out.println(pl);
            } 
            
            else if(Collections.frequency(this.owners.values(), pl) > 1){
                if(repeat){
                    System.out.println(pl);
                    repeat = false;
                }
            }

        }
    }
}
