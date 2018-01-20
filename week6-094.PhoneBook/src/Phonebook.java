
import java.util.ArrayList;


public class Phonebook {
    private ArrayList<Person> book;
    
    public Phonebook () {
        this.book = new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        Person person = new Person (name, number);
        
        this.book.add(person);
    }
    
    public void printAll(){
        for(Person prs : this.book){
            System.out.println(prs);
        }
        
    }
    
    public String searchNumber(String name){
        for(Person prs : this.book){
                if(prs.getName() == name){
                    return prs.getNumber();
                }
        }
        
        
        return "number not known";
    }
}
