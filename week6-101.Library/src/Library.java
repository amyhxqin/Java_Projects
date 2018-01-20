
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;
    
    
    
    public Library(){
        this.library = new ArrayList<Book> ();
        
    }
    
    public void addBook(Book newBook){
        this.library.add(newBook);
    }
    
    public void printBooks(){
        for(int i = 0; i < this.library.size(); i ++){
            System.out.println(this.library.get(i));
        }
        
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : this.library){
            if(StringUtils.included(book.title(), title)){
                found.add(book); 
            }
        }
                
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : this.library){
            //System.out.println(book.publisher());
            if(StringUtils.included(book.publisher(), publisher)){
                found.add(book); 
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : this.library){
            if(book.year() == year){
                found.add(book); 
            }
        }
        return found;
    
    }
}
