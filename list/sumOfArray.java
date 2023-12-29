package list;

class Solution{
    public static int sumOfArray(int[] arr){
        
        return sumOfArrayHelper(arr, 0, arr.length - 1);
    }

    public static int sumOfArrayHelper(int[] arr, int start, int end){
        if(start == end){
            return arr[start];
        }
        
        int middle = (int)Math.floor((start + end)/ 2);

        int left = sumOfArrayHelper(arr, start, middle);
        int right = sumOfArrayHelper(arr,middle + 1,end);

        return left + right;
    }
}
