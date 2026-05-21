public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = FactoryEmployeDeveloper.getEmployee("WebDeveloper");
        System.out.println(employee.salary());
    }
}
