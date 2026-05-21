public class PrototypeMainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("43.205.165.113");
        networkConnection.connectionCreate();
        System.out.println(networkConnection);

        // create a new clone of existing object rather then creating a new object of the current class
      NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();// default provide shallow copy
        System.out.println(networkConnection1);
    }
}

