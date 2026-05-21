package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.salary;
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Himanshu",10000));
        list.add(new Employee(3,"Ramo",10000));
        list.add(new Employee(2,"HOney",12000));
        Collections.sort(list);
        System.out.println(list);
        /*for(Employee e:list){
            System.out.println(e);
        }*/

        Collections.sort(list,new SortBySalary());
        System.out.println(list);

        Collections.sort(list,new CompareByName());
        System.out.println(list);
    }

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(this.id, employee.id);
    }
}
