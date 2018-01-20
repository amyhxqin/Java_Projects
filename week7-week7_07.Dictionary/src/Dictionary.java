
import java.util.ArrayList;
import java.util.HashMap;


public class Dictionary {
    private HashMap<String, String> list;
    
    public Dictionary (){
        this.list = new HashMap<String, String> ();
    
    }
    
    public String translate(String word){
        return this.list.get(word);
    }
    
    public void add(String word, String translation) {
        this.list.put(word, translation);
    }
    
    public int amountOfWords(){
        return this.list.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> arrays = new ArrayList<String> ();
        
        for(String key : this.list.keySet()){
            arrays.add(key + " = " + this.list.get(key));
        }
        
        return arrays;
    }

    
}
