
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the points [0-60]: ");
        int entry = Integer.parseInt(reader.nextLine());
        
        String grade = "";
        
        if(entry>=0 && entry<=29){
        grade = "failed";
        } else if (entry>=30 && entry<=34){
        grade = "1";
        } else if (entry>=35 && entry<=39){
        grade = "2";
        } else if (entry>=40 && entry<=44){
        grade = "3";
        } else if (entry>=45 && entry<=49){
        grade = "4";
        } else if (entry>=50 && entry<=60){
        grade = "5";
        }
        
        System.out.print("Grade: " + grade);

    }
}
