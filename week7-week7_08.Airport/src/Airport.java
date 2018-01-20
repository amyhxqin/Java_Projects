
import java.util.ArrayList;
import java.util.Scanner;


public class Airport {
    private Scanner reader;
    private ArrayList<Airplane> airplanesList;
    
    public Airport () {
        this.reader = new Scanner (System.in);
        this.airplanesList = new ArrayList<Airplane> ();
    }
    
    public void start () {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        
        String input = " ";
        
        while(true){
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            
            System.out.print("> ");
            input = this.reader.nextLine();
            
            if(input.equals("1")) {
                System.out.print("Give plane ID: ");
                String id = this.reader.nextLine();
                
                System.out.print("Give plane capacity: ");
                int capacity = Integer.parseInt(this.reader.nextLine());
                
                //Add to variable
                this.airplanesList.add(new Airplane(id, capacity));

            }
            else if(input.equals("2")){
                System.out.print("Give plane ID: ");
                String id = this.reader.nextLine();
                
                System.out.println("Give departure airport code: ");
                String departure = reader.nextLine();
                
                System.out.println("Give destination airport code: ");
                String destination = reader.nextLine();
                
                for(Airplane plane : this.airplanesList){
                    if(plane.getId().equals(id)){
                        plane.addFlight(departure, destination);
                    }
                }
                
            }
            else if(input.equals("x")){
                break;
            }
        }
        
        System.out.println("");
        
        flightService();
    }
    
    public void flightService () {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        
        String input = " ";
        
        while(true){
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            
            System.out.print("> ");
            input = this.reader.nextLine();
            
            if(input.equals("1")) {
                for(Airplane plane : this.airplanesList){
                    System.out.println(plane);
                }

            }
            else if(input.equals("2")){
                for(Airplane plane : this.airplanesList){
                    plane.printAllFlights();
                }
                
            }
            else if(input.equals("3")){
                System.out.print("Give plane ID: ");
                input = this.reader.nextLine();
                
                    for(Airplane plane : this.airplanesList){
                        if(plane.getId().equals(input)){
                            System.out.println(plane);
                        }
                    }
                
            }
            else if(input.equals("x")){
                break;
            }
            
        }
    
    }
}
