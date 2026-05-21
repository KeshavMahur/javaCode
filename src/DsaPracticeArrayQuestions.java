import java.util.Arrays;
import java.util.stream.IntStream;

public class DsaPracticeArrayQuestions {
    public static void main(String[] args) throws Exception{
        int arry[] = {0,1,2,2,2,3,4,5,6};
        /*int removeDucplicateArray [] = new int[arry.length];
        for (int i = 0; i < arry.length; i++) {
            int count = 1;
            for (int j = i+1; j <arry.length -1 ; j++) {
                if(arry[i] == arry[j]){
                    count++;
                }
            }
            if(count 0)
        }*/

        //int tempArray[] = {0,1,2,50,0,2,10,0};


       /*// right shift all zeros in a array
        int index = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if(tempArray[i] != 0){
                int temp = tempArray[index];
                tempArray[index] = tempArray[i];
                tempArray[i] = temp;
                index++;
            }
        }
        for (int elem:tempArray) {
            System.out.println(elem);
        }*/

       /*// sort the given array in descending order
         for (int i = 0 ; i<tempArray.length; i++) {
             for (int j = 0 ; j < tempArray.length;j++) {
                if(tempArray[j] !=  && tempArray[i]tempArray[j] < ){

                }
            }
        }*/

        /*//#find the second largest number in array
        int largestNumber = tempArray[0] , secondLargest = tempArray[1];
        for (int i = 0 ; i < tempArray.length; i++){
            if(tempArray[i] > largestNumber){
                secondLargest = largestNumber;
                largestNumber = tempArray[i];
            }else if(tempArray[i] > secondLargest && tempArray [i] != largestNumber){
                secondLargest = tempArray[i];
            }
        }
        System.out.println(secondLargest);*/

        // find the maximum element in array
       /* int largestElement = 0;
        for (int i = 0; i < tempArray.length; i++){
            if(largestElement < tempArray[i])
                largestElement = tempArray[i];
        }
        System.out.println("Largest Element => "+ largestElement);

        final int nhi_mila_be = Arrays.stream(tempArray).max().orElseThrow(() -> new Exception("nhi mile be"));
        System.out.println(nhi_mila_be);*/


        // 2 reverse of array
        /*int reversearray[] = new int[tempArray.length];
        for (int i = tempArray.length; i > 0 ; i--){
            reversearray[tempArray.length - i] = tempArray[i - 1];
        }
        for (int i = 0 ; i < reversearray.length ; i++){
            System.out.println(reversearray[i]);
        }

        final int[] ints = IntStream.range(0, tempArray.length).map(i -> tempArray[tempArray.length - 1 - i]).toArray();
        System.out.println(Arrays.toString(ints));*/

        /*int sum = Arrays.stream(tempArray).sum();
        System.out.println(sum);
        int sumValue  = 0 ;
        for (int i = 0 ; i < tempArray.length ; i++){
            sumValue += tempArray[i];
        }
        System.out.println(sumValue);*/

    }
}
