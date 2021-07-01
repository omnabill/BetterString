
public class BetterStringMain {
   
    public static void main(String[] args) {
        String string1 = "skmkasm";  
        String string2 = "sgmgmdmbhbj";
        String longer = BetterString.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());  
       // String first = test.betterString(string1, string2, (s1, s2) -> true);
        System.out.println(longer);
      //  System.out.println(first);

    }
}