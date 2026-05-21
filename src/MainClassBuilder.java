public class MainClassBuilder {
    public static void main(String[] args) {
        BuilderDesignPattern builderDesignPattern = new BuilderDesignPattern.BuilderClass("rahul","20").setAddress("bsr").setEmail("asdasda").build();
        System.out.println(builderDesignPattern);
        BuilderDesignPattern builderDesignPattern1 = new BuilderDesignPattern.BuilderClass("rahul","20").build();
        System.out.println(builderDesignPattern1);
    }
}
