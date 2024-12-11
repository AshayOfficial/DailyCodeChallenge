package practise.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ashay", "Mumbai", "Prabhadevi");
        Employee e2 = new Employee("Aditya", "Mumbai", "BKC");
        Employee e3 = new Employee("Ankit", "Mumbai", "Airport Road");
        Employee e4 = new Employee("Keyur", "Mumbai", "Airport Road");

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

        Map<String, List<Employee>> empMap = empList.stream()
                .collect(Collectors.groupingBy(Employee::getWorkPlaceAddress));

        empMap.forEach((city, employee) -> System.out.println("City :: " + city + ", Employee :: " + employee));
    }
}

class Employee {
    String name;
    String city;
    String workPlaceAddress;

    public Employee(String name, String city, String workPlaceAddress) {
        this.city = city;
        this.name = name;
        this.workPlaceAddress = workPlaceAddress;
    }

    public Employee(){super();}

    public String getCity() {
        return this.city;
    }
    public String getName() {
        return this.name;
    }
    public String getWorkPlaceAddress() {
        return this.workPlaceAddress;
    }
}
