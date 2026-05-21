package array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayQuestionOfTwoPointers {

    // useing two pointer
    public int removeDuplicate(int array[]){
        int i = 0;
        for(int j = 1 ; j < array.length; j++){
            if(array[i] != array[j]){
                array[++i] = array[j];
            }
        }
        return i + 1;
    }

    public int removeDuplicateWithRecursion(int array[],int i , int j){
        if(j == array.length){
            return i + 1;
        }
        if(array[i] != array[j]){
            array[++i] = array[j];
        }
        return removeDuplicateWithRecursion(array,i,j+1);
    }

    public void printArayUsingRecursion(int array[],int i){
        if(i == array.length){
            return;
        }
        System.out.print(array[i]+ " ");
        printArayUsingRecursion(array,i+1);

    }


    private int removeMatchingElementAndGivenUniqueNumberSize(int array[],int matchingElement){
        int i = 0;
        for (int j = 0 ; j < array.length;j++){
            if(array[j] != matchingElement){
                array[i++] = array[j];
            }
        }
        return i;
    }

    private void rightShiftZeroFromArray(int array[]){
        int i = 0;
        for (int j = 0;j<array.length;j++){
            if(array[j] != 0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }
    }


    private void reverseOfArray(int array[]){
        int i = array.length - 1;
        for (int j = 0; j < i ;j++){
            int temp =  array[i];
            array[i--] = array[j];
            array[j] = temp;
        }
    }

    // it is not sum II useing two pointer
    public int[] sumOofTwoNumberInSortedArray(int array[],int targetValue){
        int i = 0;
        while (i < array.length){
            int j = i+1 ;
            while (j < array.length){
                int sum = array[i] + array[j];
                if(sum == targetValue){
                    return new int[]{i,j};
                }
                j++;
            }
            i++;
        }
        return new int[]{};
    }


    private int[] sumOfTwoNumbers(int array[],int targetValue){
        int i = 0 , j = array.length - 1;
        while (i < j){
            int sum = array[i] + array[j] ;
            if(sum == targetValue){
                return new int[]{i+1,j+1};
            }
            if (sum < targetValue){
                i++;
                continue;
            }
            if (sum > targetValue){
                j--;
                continue;
            }
        }
        return new int[]{};
    }

    // not useing two pointer technique but useing hasMap
    // array = [1,2,4,5,6,7,8,9,10] : targetValue =
    private int[] sumTwoNumberInArray(int array[],int targetValue){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int need = targetValue - array[i];
            if (map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            map.put(array[i],i);
        }
        return new int[]{};
    }

    // [-11,-9,-1,0,2,4,6,10]
    public int[] squareOfSortedAssendingArray(int array[]){
        int result[] = new int[array.length];
        int i = 0;
        int j = array.length - 1;
        int resultArrayIndex = array.length - 1;
        while (i<=j){
            int left = array[i] * array[i];
            int right = array[j] * array[j];
            if(left > right){
                result[resultArrayIndex] = left;
                i++;
            }else {
                result[resultArrayIndex] = right;
                j--;
            }
            resultArrayIndex--;
        }
        return result;
    }


    // buy and sell stock I :- input [7,1,2,4,5,6]
    public int buyAndSellAStockInDay(int array[]){
        int maxProfit = 0;
        int miniBuy =   Integer.MAX_VALUE;
        for (int i = 0; i<array.length;i++){
            if(miniBuy > array[i]){
                miniBuy = array[i];
            }else {
                int profit = array[i] - miniBuy;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    // buy and sell stock I :- input [7,1,2,4,5,6]
    public int buyAnsSellStockInDayII(int array[]){
        int profit = 0;
        for (int i = 1 ; i<array.length;i++){
            if(array[i] > array[i-1]){
                profit+= array[i] - array[i-1];
            }
        }
        return profit;
    }

    // fill with last position
    public void margeTwoArray(int array1[],int m , int array2[],int n){
        int i = m - 1 ;
        int j = n - 1;
        int lastFillingIndex = m + n - 1;
        while (i >= 0 && j >= 0){
            if(array1[i] > array2[j]){
                array1[lastFillingIndex] = array1[i];
                i--;
            }else {
                array1[lastFillingIndex] = array2[j];
                j--;
            }
            lastFillingIndex--;
        }

        while (j >=0){
            array1[lastFillingIndex] = array2[j];
            j--;
        }
    }

    public boolean duplicateElement(int array[]){
        Set<Integer> set = new HashSet<>();
        /*for (int i = 0; i < array.length; i++) {
            if(set.contains(array[i])){
               return true;
            }
            set.add(array[i]);
        }*/

        for (int element : array){
            if(!set.add(element)){
                return true;
            }
        }
        return false;
    }


    // [0,2,3,4,5]
    public int findMissingNumbers(int array[]){
        int length = array.length;
        int expectedSum = length * (length+1) / 2;
        int actualOutput = 0;
        for (int num:array){
            actualOutput+= num;
        }
        return expectedSum - actualOutput;
    }

    //[2,3,2,3,1]
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            int count = map.getOrDefault(num,0) + 1;
            map.put(num,count);
        }

        for (int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }

        return -1;
    }


    public Set<List<Integer>> threeSum(int array[]){
        Set<List<Integer>> pairs =  new HashSet<>();
        int length = array.length;
        for (int i = 0 ;i < length ; i++){
            for(int j = i + 1; j< length ; j++){
                for (int k = j +1 ; k<length;k++){
                    if(array[i] + array[j] + array[k] == 0){
                        List<Integer> data = Arrays.asList(array[i],array[j],array[k]);
                        Collections.sort(data);
                        pairs.add(data);
                    }
                }
            }
        }
        return pairs;
    }


    public static void main(String[] args) {
        ArrayQuestionOfTwoPointers arrayQuestionOfTwoPointers = new ArrayQuestionOfTwoPointers();
        int array[] = new int[]{0,0,1,1,2,2,3,3,4,5};

        // remove duplicate onlyone copy existin array and cound

        /*int uniqNumber = removeDuplicateUseingTwoPointer.removeDuplicate(array);
        System.out.println(uniqNumber);
        removeDuplicateUseingTwoPointer.printArayUsingRecursion(array,0);
*/
        //System.out.println("Uniq element => "+ removeDuplicateUseingTwoPointer.removeDuplicateWithRecursion(array,0,1));

        // remove matching element from array
        int notmatchingCOunt  = arrayQuestionOfTwoPointers.removeMatchingElementAndGivenUniqueNumberSize(array,5);
        System.out.println(notmatchingCOunt);
        arrayQuestionOfTwoPointers.printArayUsingRecursion(array,0);
    }
}
