package array;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee t1) {
        return Double.compare(employee.getSalary(), t1.getSalary());
    }
}
