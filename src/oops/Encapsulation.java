package oops;

public class Encapsulation {
    private int salary;

    public Encapsulation(){

    }



    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary1){
        if(salary1 > 0){
            this.salary = salary1;
        }
    }
}
