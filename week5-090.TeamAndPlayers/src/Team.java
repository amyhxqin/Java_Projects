
import java.util.ArrayList;


public class Team {
    private String name;
    private ArrayList<Player> members;
    private int maxSize;
    
    public Team (String name) {
        this.name = name;
        this.members = new ArrayList<Player> ();
        this.maxSize = 16;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player player){
        if(this.members.size() < this.maxSize){
            this.members.add(player);
        }
    }
    
    public void printPlayers () {
        for(Player pl : this.members){
            System.out.println(pl);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size() {
        return this.members.size();
    }
    
    public int goals () {
        int sumGoals = 0;
        for(Player pl : this.members){
            sumGoals += pl.goals();
        }
        
        return sumGoals;
    }
}
