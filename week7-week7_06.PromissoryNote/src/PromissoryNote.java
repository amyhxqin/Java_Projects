
import java.util.HashMap;


public class PromissoryNote {
    private HashMap<String, Double> list;
    
    public PromissoryNote() {
        this.list = new HashMap<String, Double> ();
    }
    
    public void setLoan(String toWhom, double value){
        this.list.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if (this.list.get(whose) == null){
            return 0;
        }
        else{
            return this.list.get(whose);
        }
    }
}
