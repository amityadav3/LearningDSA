package hashtable.content;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PractiseBucketSort {
    public static void main(String[] args) {
        int[] arr = {33,34,23,29,44,32,53,11};
        int[] result = bucketSort(arr);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] bucketSort(int[] arr) {
        List<Integer>[] buckets = new List[10];

        for(int i =0;i< buckets.length;i++){
            buckets[i] = new ArrayList<Integer>();
        }

        for(int i =0;i< arr.length;i++){
            buckets[hashedKey(arr[i])].add(arr[i]);
        }
        int j=0;
        Arrays.stream(buckets).forEach(el -> el.sort(Integer::compareTo));
        for(int i=0;i< buckets.length;i++){
            for(int val: buckets[i]){
                arr[j++] = val;
            }
        }
        return arr;
    }
    private static int hashedKey(int key){
        return key / (int) 10 % 10;
    }
}
