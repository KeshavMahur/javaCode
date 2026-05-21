public class NetworkConnection implements Cloneable {
    private String ip;
    private String connectionUrl;
    private String dbName;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void connectionCreate(){
        this.connectionUrl = "Connection create ka ek heavy logic";

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone(); // shallow copy
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("43.09809809");
        return networkConnection;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", connectionUrl='" + connectionUrl + '\'' +
                '}';
    }
}
