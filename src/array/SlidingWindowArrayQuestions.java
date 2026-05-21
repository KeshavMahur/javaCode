package array;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindowArrayQuestions {

    //Maximum Sum Subarray of Size K
    public int maximumSubArray(int array[],int k){
        int maxSum = 0 , windowSum = 0 ;
        for (int i = 0 ; i < k;i++){
            windowSum+=array[i];
            if(windowSum > maxSum){
                maxSum = windowSum;
            }
        }

        for (int i = k ; i < array.length; i++){
            windowSum+=array[i];
            windowSum-=array[i-k];
            if(windowSum > maxSum){
                maxSum = windowSum;
            }
        }

        return maxSum;
    }


    //Average of Subarrays of Size K
    public int[] averageOfSubArray(int array[],int k){
        int averageAry[] = new int[array.length - k + 1];

        int windowSum = 0;
        int arrayIndex = 0;
        for (int i = 0 ;i<k;i++){
            windowSum+=array[i];
        }
        averageAry[arrayIndex++] = windowSum/k;

        for (int i = k; i <array.length ; i++) {
            windowSum+=array[i];
            windowSum-=array[i-k];
            averageAry[arrayIndex++] = windowSum/k;
        }

        return averageAry;
    }

    //Contiguous Array
    public int ContiguousArray(int array[]){
        int prefixSum = 0 , maxLength = 0;
        Map<Integer,Integer> map = new HashMap<>();
        // key prefixSum of index -1
        map.put(0,-1);

        for (int i = 0 ; i < array.length; i++) {
            int elem = array[i];
            prefixSum += (elem == 0) ? -1 : 1;
            if (map.containsKey(prefixSum)) {
                int finalCount = i - map.get(prefixSum);
                maxLength = finalCount > maxLength ? finalCount : maxLength;
            } else {
                map.put(prefixSum, i);
            }
        }
        return maxLength;
    }


    public static void main(String[] args) {
        SlidingWindowArrayQuestions slidingWindowArrayQuestions = new SlidingWindowArrayQuestions();
        int array[] = new int[]{1,4,2,10,23,3,1,0,20};
        int k = 4;
        System.out.println(slidingWindowArrayQuestions.maximumSubArray(array,k));
    }
}
