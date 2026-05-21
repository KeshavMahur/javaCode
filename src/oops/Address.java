package oops;

public class Address implements Cloneable{
    private String cityName;


    public Address(String cityName){
        this.cityName  = cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return this.cityName;
    }

    private String getCityName(){
        return this.getCityName();
    }

}
