import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateString {
    public static void main(String[] args) {
        String str = "Welcome to code decode code decode Welcome you";
        String[] strArray = str.split(" ");

        List<String> list =  Arrays.stream(strArray).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .map(entry->entry.getKey())
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
