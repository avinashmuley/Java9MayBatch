package Collection;

import java.util.PriorityQueue;

public class Employee {
    private Integer id;
    private String name;
    private Number salary;


    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

class EmployeeQueue{
    public static void main(String[] args) {
        PriorityQueue<Employee> employees = new PriorityQueue<>();
        Employee e1 = new Employee(1,"Avinash", 40000.0);
        Employee e2 = new Employee(2,"Ankit",50000.0);
        Employee e3 = new Employee(3,"Bhushan",43500.0);
        employees.offer(e1);
        employees.offer(e2);
        employees.offer(e3);

        System.out.println(employees);
        System.out.println(employees.poll());

    }
}
