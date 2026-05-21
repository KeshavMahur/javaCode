package array;

import java.util.HashMap;
import java.util.Map;

public class PrefixOperations {

    public int[] prefixSumOfArray(int array[]){
        int sum = 0;
        int prefixSumArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
            prefixSumArray[i] = sum;
        }
        return prefixSumArray;
    }

    public int preFixSumGivenPosition(int left, int right, int prefixSumArray[]){
        if(left == 0){
            return prefixSumArray[right];
        }
        return prefixSumArray[right] - prefixSumArray[left -1];
    }


    private int SubarraySumEqualsK(int array[],int k){
        int prefix = 0 , count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(prefix,1);
        for (int i = 0; i < array.length; i++) {
            prefix+= array[i];
            int existingKey = prefix-k;
            if(map.containsKey(existingKey)){
                count+= map.get(prefix-k);
            }
            map.put(prefix,map.getOrDefault(prefix,0) + 1);
        }
        return count;
    }

    private int SubarrayDivisibleByK(int array[],int k){
        int count = 0, prefix = 0 ;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < array.length; i++) {
            prefix+=array[i];
            int reminder = prefix % k;
            if(reminder < 0) reminder +=k;
            count+= map.getOrDefault(reminder,0);
            map.put(reminder,map.getOrDefault(reminder,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        PrefixOperations prefixOperations = new PrefixOperations();
        System.out.println(prefixOperations.SubarraySumEqualsK(new int[]{1,1,1},2));
    }
}
