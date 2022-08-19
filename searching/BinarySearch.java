package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-22,-8,1,4,6,8,9};
        int start = 0;
        int end =arr.length;
        int element = 9;
        int result = recursiveSolution(arr, start, end, element);
        if(result == -1)
            System.out.println("No such element found!");
        else
            System.out.println("Found at index : " +result);
        boolean flag = false;
        while(start<end){
            int mid = (start + end) / 2;
            if(element==arr[mid]){
                System.out.println("Found at index : " + mid);
                flag = true;
                break;
            }
            if(element>arr[mid])    start = mid+1;
            else    end = mid;
        }
        if(!flag)
            System.out.println("No such element found");
    }

    private static int recursiveSolution(int[] arr, int start, int end, int element) {
        if(start>=end)   return -1;
        int mid = (start + end) / 2;
        if(element==arr[mid])   return mid;
        else if(element>arr[mid])   return recursiveSolution(arr, mid+1, end, element);
        else    return recursiveSolution(arr, start, mid, element);
    }
}
