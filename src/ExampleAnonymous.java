public interface ExampleAnonymous {
    int calculationOfTwoInt(int a, int b);

     static void main(String[] args) {
        ExampleAnonymous obj = new ExampleAnonymous(){
            @Override
            public int calculationOfTwoInt(int a, int b) {
                return a + b;
            }
        };
         System.out.println(obj.calculationOfTwoInt(10,20));
    }
}
