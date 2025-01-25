import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SummaryStatistics {

    public static void main(String[] args) {
         List<Integer> list = Arrays.asList(10,20,9,45,99);

        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Sum: "+ intSummaryStatistics.getSum());
        System.out.println("Max: "+ intSummaryStatistics.getMax());
        System.out.println("Min: "+ intSummaryStatistics.getMin());
        System.out.println("Count: "+ intSummaryStatistics.getCount());
        System.out.println("Average: "+ intSummaryStatistics.getAverage());

        list.stream().sorted((s1,s2)->s2-s1).skip(1).limit(1).forEach(System.out::println);

    }
}
