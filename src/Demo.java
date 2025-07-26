import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {




        List<Employee> list = Arrays.asList(new Employee(1L, "sham", 6000),
                new Employee(2L,"ram",300),
                new Employee(3L,"bam",200),
                new Employee(3L,"Shanku",5000),
                new Employee(4L,"rishi",2000));

        List<String> collect = list.stream().filter(n -> n.getSalary() >= 20000).map(Employee::getName).collect(Collectors.toList());
        System.out.println(collect);

        List<Employee> sorted = list.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
        System.out.println(sorted);

        list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).limit(1).forEach(System.out::println);
    }


}
