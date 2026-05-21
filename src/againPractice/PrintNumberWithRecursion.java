package againPractice;

public class PrintNumberWithRecursion {

    public static void mainPrintNumber1To10(int number){

        //1st declare exit point of method

        if(number > 10){
            System.out.println("Print Number 1 to 10 End");
            return;
        }

        System.out.println(number);
        mainPrintNumber1To10(number + 1);
    }


    public static void mainPrintNumber10To1(int number){
        //1st declare exit point of method

        if( number < 1){
            System.out.println("Print Number 10 to 1");
            return;
        }

        System.out.println(number);
        mainPrintNumber10To1(number - 1);
    }

    public static int printNumberSum1To10(int number){
        if(number > 10){
            return 0;
        }
        return number + printNumberSum1To10(number+1) ;
    }

    public static int printFactorial(int number){
        if(number < 1){
            return 1;
        }

        return number * printFactorial(number - 1) ;
    }



    public static void printFibonacciSeriesWithLoop(int number){
        int a = 1;
        int b = 2;
        System.out.print(a + ",");
        System.out.print(b + ",");
        for (int i = 2; i< 10;i++){
            int c = a + b;
            System.out.print(c+",");
            a = b;
            b = c;
        }
    }

    public static void printFibonacciSeriesWithRecursion(int a,int b,int number){
        if(number < 1){
            System.out.println("Series Print end");
            return;
        }
        int c = a + b;
        System.out.print(c+",");
        printFibonacciSeriesWithRecursion(b , c, number - 1);
    }

    public static int sumOfArrayWithRecursion(int array[],int sizeOfAray){
        if(sizeOfAray < 1){
            return 0;
        }
        return array[sizeOfAray - 1] + sumOfArrayWithRecursion(array,sizeOfAray - 1);
    }

    public static void main(String[] args) {
    //mainPrintNumber1To10(1);
    //mainPrintNumber10To1(10);
       // System.out.println(printNumberSum1To10(1));
       // System.out.println(printFactorial(5));
        //printFibonacciSeriesWithLoop(10);
        /*int a = 0;
        int b = 1;
        System.out.print(a+","+b+",");
        printFibonacciSeriesWithRecursion(a,b,10);
   */
        int array[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumOfArrayWithRecursion(array,array.length));
    }
}
