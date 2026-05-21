public class BillPugSingleton {

    private BillPugSingleton(){
    }

    private static class Helper{
        private static  final BillPugSingleton instance = new BillPugSingleton();
    }

    public static BillPugSingleton getInstance(){
        return Helper.instance;
    }
}
