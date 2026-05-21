public class SingletonDesignPattern {

    private static SingletonDesignPattern instance;

    private SingletonDesignPattern(){}

    public static SingletonDesignPattern getInstance(){
        return instance == null ? instance = new SingletonDesignPattern() : instance;
    }

}
