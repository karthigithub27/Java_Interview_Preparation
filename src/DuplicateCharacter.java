import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacter {

    public static void main(String[] args) {

        String str = "codec";
        String[] strArray = str.split("");

       List<String> list = Arrays.stream(strArray).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry ->entry.getValue()>1)
                .map(entry->entry.getKey())
                .collect(Collectors.toList());

        System.out.println(list);

//        System.out.println("Using Maps");
//        Map<String,Integer> map = new HashMap<>();
//
//        for(String s:strArray){
//            map.put(s,map.getOrDefault(s,0)+1);
//        }
//
//        for(Map.Entry entry:map.entrySet()){
//            if(entry.getValue() > 1) System.out.println(entry.getKey());
//        }

    }
}
