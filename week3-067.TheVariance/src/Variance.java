import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
   public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        int i = 0;
        
        while(i<list.size()){
            sum += list.get(i);
            i++;
        }
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        return 1.0*sum(list)/list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double varianceSum = 0;
        double average = average(list);
        
        for(int item : list){
            varianceSum += Math.pow(item - average, 2);
            
        }
        
        return varianceSum/(list.size()-1);
        
        /*int i = 0;
        double answer = 0;
        
        while(i<list.size()){
            answer += Math.pow(list.get(i) - average(list), 2)/(list.size()-1);
            i++;
            
        }
        
        return answer;*/
        
        
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        /*list.add(2);
        list.add(9);
        list.add(1);
        list.add(3);
        list.add(5);*/
        
        

        System.out.println("The variance is: " + variance(list));
    }

}
