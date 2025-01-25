import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReverse {

    public static void main(String[] args) {
        String str = "karthikeyan";
        String[] strArray = str.split("");
        int length = strArray.length;

        IntStream.range(0,length/2)
                .forEach((i)->{
                    String temp = strArray[i];
                    strArray[i] = strArray[length - (i+1)];
                    strArray[length - (i+1)] = temp;
                });

        String reversed = Arrays.stream(strArray).collect(Collectors.joining(""));
        System.out.println("Reversed: "+reversed);
    }
}
