public class BuilderDesignPattern {
    @Override
    public String toString() {
        return "BuilderDesignPattern{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private final String name;
    private final String age;
    private final String address;
    private final String email;

    private BuilderDesignPattern(BuilderClass builderClass){
        this.name = builderClass.name;
        this.age = builderClass.age;
        this.address = builderClass.address;
        this.email = builderClass.email;
    }

    public static class BuilderClass {
        private final String name;
        private final String age;
        private String address;
        private String email;

        public BuilderClass(String name,String age){
            this.name = name;
            this.age = age;
        }


        public BuilderClass setAddress(String address){
            this.address = address;
            return this;
        }

        public BuilderClass setEmail(String email){
            this.email =  email;
            return this;
        }

        public BuilderDesignPattern build(){
            return new BuilderDesignPattern(this);
        }



    }
}
