public class FactoryEmployeDeveloper {
    // get the Employee
    public static Employee getEmployee (String developerType){
        developerType = developerType.trim();
        switch (developerType){
            case "ANDROID":
                return new EmployeeAndroidDeveloper();
            case "WebDeveloper":
                return new WebDeveloper();
            default:
                return null;
        }
    }
}
