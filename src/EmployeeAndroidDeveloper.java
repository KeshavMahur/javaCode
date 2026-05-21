public class EmployeeAndroidDeveloper implements Employee ,AbstractEmployee {
    @Override
    public int salary() {
        System.out.println("Android wale ki salary ");
        return 10000000;
    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public String profileDeveleoper() {
        return "bhura";
    }
}
