import java.util.ArrayList;
import java.util.List;

public class EmployeeSalarySort {

    public static void main(String[] args) {
         List<Employee> list = new ArrayList<>();

         list.add(new Employee(101,500));
        list.add(new Employee(102,1000));
        list.add(new Employee(103,1500));
        list.add(new Employee(104,2000));
        list.add(new Employee(105,2500));
        list.add(new Employee(106,3000));

        list.stream().sorted((e1,e2)-> e2.getSalary() - e1.getSalary()).forEach(System.out::println);
    }
}
