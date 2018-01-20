
import java.util.ArrayList;


public class Distribution {
    private ArrayList<Integer> grades;
    private int allScores;
    private int accepted;
    private int count0;
    private int count1;
    private int count2;
    private int count3;
    private int count4;
    private int count5;
    
    public Distribution (){
        this.grades = new ArrayList<Integer> ();
        this.allScores = 0;
        this.accepted = 0;
    }
    
    public void add(int grade){
        if(grade <= 60 && grade >= 0){
            this.grades.add(grade);
            this.allScores++;

            if(grade >= 30){
                this.accepted++;
            }
        }
    }
    
    public double percentage (){
        if(this.allScores != 0){
            return 100.0 * this.accepted/this.allScores;
        }
        else{
            return 0.0;
        }
    }
    
    public void printStars(int times) {
        for(int i = times; i > 0; i --){
             System.out.print("*");
        }
        
        System.out.println("");
    
    }
    
    public void count () {
        
        for(int grade : this.grades){
            
            if(grade >= 50){
                this.count5++;
            }
            
            if(grade >= 45 && grade <= 49){
                this.count4++;
            }
            

            if(grade >= 40 && grade <= 44){
                this.count3++;
            }
                
            if(grade >= 35 && grade <= 39){
                this.count2++;
            }

            if(grade >= 30 && grade <= 34){
                this.count1++;
            }

            if(grade >= 0 && grade <= 29){
                this.count0++;
            }
            
        }
    }
    
    public void print () {
        count();
        
        System.out.println("Grade distribution:");

            System.out.print("5: ");
            printStars(this.count5);
            
            System.out.print("4: ");
            printStars(this.count4);

            System.out.print("3: ");
            printStars(this.count3);
            
            System.out.print("2: ");
            printStars(this.count2);
            
            System.out.print("1: ");
            printStars(this.count1);
            
            System.out.print("0: ");
            printStars(this.count0);
        System.out.println("Acceptance percentage: " + percentage());
    }
}
