public class FFMUser {
    private final int id;
    private final String name;
    private final String email;
    private final String password;
    private final String address;

    private FFMUser(Helper helper) {
        this.id = helper.id;
        this.name = helper.name;
        this.email = helper.email;
        this.password = helper.password;
        this.address = helper.address;
    }

    public static class Helper{
        private final int id;
        private final String name;
        private String email;
        private String password;
        private String address;

        public Helper(int id, String name){
            this.id = id;
            this.name = name;
        }

        public Helper setEmail(String email){
            this.email = email;
            return this;
        }

        public Helper setPassword(String password){
            this.password = password;
            return this;
        }

        public Helper setAddress(String address){
            this.address = address;
            return this;
        }

        public FFMUser build(){
            return new FFMUser(this);
        }
    }

    public static void main(String[] args) {
        FFMUser ffmUser = new FFMUser.Helper(1,"keshav").build();
    }
}
