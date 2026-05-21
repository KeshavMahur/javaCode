package oops;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class EmployeeClass implements Cloneable {
    private int id;
    private String name;
    private Address address;
    public EmployeeClass(int id,String name,Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }

    @Override
    public boolean equals(Object o) {
        EmployeeClass employeeClass = (EmployeeClass) o;
        return this.id == employeeClass.id && this.name.equals(employeeClass.name);
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.address.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        EmployeeClass clone = (EmployeeClass) super.clone();
        clone.address = (Address) address.clone();
        return clone;
    }

    public static void main(String[] args) throws  CloneNotSupportedException {
        /*Set<EmployeeClass> employeeClassSet =  new HashSet<>();
        employeeClassSet.add(new EmployeeClass(1,"A"));
        employeeClassSet.add(new EmployeeClass(1,"A"));
        employeeClassSet.add(new EmployeeClass(2,"B"));
        System.out.println(employeeClassSet.size());*/

        EmployeeClass employeeClass =  new EmployeeClass(1,"A",new Address("Skd"));
        System.out.println(employeeClass);
        EmployeeClass employeeClass1 = (EmployeeClass) employeeClass.clone();
        employeeClass1.address.setCityName("BSR");
        System.out.println(employeeClass);
        System.out.println(employeeClass1);
    }
}
