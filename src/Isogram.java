import java.util.HashSet;
import java.util.Set;

public class Isogram {

    public static void main(String[] args) {
        String str = "code";
        char[] chArray = str.toCharArray();
        boolean isIsogram = true;
        Set<Character> set = new HashSet<>();

        for(Character ch:chArray){
            if(set.contains(ch)){
                isIsogram = false;
            }else {
                set.add(ch);
            }
        }

        if(isIsogram){
            System.out.println("The given string is isogram");
        }else {
            System.out.println("Not Isogram");
        }


    }
}
