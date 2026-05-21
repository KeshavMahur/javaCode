public class EmployeeAbstractFactory {

    public static AbstractEmployee getEmployee(EmployeeAbstract employeeAbstract){
        return employeeAbstract.creatEmployeObj();
    }
}
