public class WebDeveloper implements Employee, AbstractEmployee{
    @Override
    public int getSalary() {
        return 2500000;
    }

    @Override
    public String profileDeveleoper() {
        return "java developer";
    }

    @Override
    public int salary() {
        System.out.println("Keshav ka package");
        return 2400000;
    }
}
