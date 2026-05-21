package array;

import java.util.Comparator;

public class CompareByName implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee t1) {
        return employee.getName().compareTo(t1.getName());
    }
}
