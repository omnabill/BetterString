import java.util.function.BiPredicate;

public class BetterString{
    public static String betterString(String s1,String s2,BiPredicate<String,String> p){
        if(p.test(s1, s2) == true){
            return s1;
        }
        return s2;
        
    }
}
