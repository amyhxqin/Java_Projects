
public class StringUtils {
    public static boolean included(String word, String searched){
        word = word.toUpperCase();
        
        searched = searched.trim();
        searched = searched.toUpperCase();
        
        
        
        
        //System.out.println(searched);
        //System.out.println(word);
        
        return word.contains(searched);
    }
}
