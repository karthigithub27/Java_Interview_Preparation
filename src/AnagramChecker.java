import java.util.Arrays;

public class AnagramChecker {

    public static void main(String[] args) {

        String str1 = "mug";
        String str2 = "gum";

        boolean isAnagramCheck = isAnagram(str1,str2);

        if(isAnagramCheck){
            System.out.println("The given strings are Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }

    private static boolean isAnagram(String str1, String str2) {

        if(str1.length() != str2.length()){
            return false;
        }

        //convert string to char array
        char[] chArr1 = str1.toCharArray();
        char[] chArr2 = str2.toCharArray();

        //Sort char array
        Arrays.sort(chArr1);
        Arrays.sort(chArr2);

        //compare sort array
        return Arrays.equals(chArr1,chArr2);
    }
}
