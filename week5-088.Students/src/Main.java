
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        String name = " ";
        String studentnumber = " ";
        
        while(true){
            System.out.print("name: ");
            name = reader.nextLine();
            
            if(name.equals("")){
                break;
            }
            else{
                System.out.printf("studentnumber: ");
                studentnumber = reader.nextLine();
                
                list.add(new Student(name, studentnumber));
            }
        
        }
        
        for(Student prs : list){
            System.out.println(prs);
        }
        
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        
        System.out.println("Result:");
        for(Student prs : list){
            if(prs.getName().contains(search)){
                System.out.println(prs);
            }
        }
        
    }
}