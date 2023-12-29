package list;

class Solution{
    public static int[] doubledArray(int[] arr){
    
        return doubledArrayHelper(arr, 0, arr.length -1 );
    }

    public static int[] doubledArrayHelper(int[] arr, int start, int end){
        if(start == end){
            arr[start] = arr[start] * 2;
            return arr;
        }
        
        int middle = (int)Math.floor((start + end) / 2);

        doubledArrayHelper(arr, start, middle);
        doubledArrayHelper(arr, middle-1, end);

        return arr;
    }
}
