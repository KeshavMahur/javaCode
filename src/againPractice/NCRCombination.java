package againPractice;

public class NCRCombination {
    public static int factorialOfNumber(int number){
        if(number < 1){
            return 1;
        }
        return number * factorialOfNumber(number - 1);
    }

    public static int ncr(int number , int r){
        if(r > number)
            return 0;
        return factorialOfNumber(number) / (factorialOfNumber(r) * factorialOfNumber(number - r));
    }


    public static int nCrRecursive(int n, int r){
        if(r == 0  || n==r){
            return 1;
        }
        return nCrRecursive(n-1,r -1) + nCrRecursive(n-1,r);
    }

    public static void main(String[] args) {
        int n = 10;
        int r = 1;
        System.out.println(nCrRecursive(n,r));
    }
}
