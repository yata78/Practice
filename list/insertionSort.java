package list;

class Solution{
    public static int[] insertionSort(int[] arr){
        
        for (int i = 1; i < arr.length; i++){
            int currentNumber = arr[i];
            for (int j = i - 1; j >= 0; j--){
                if(currentNumber <= arr[j]){
                    arr[j + 1] = arr[j];
                    arr[j] = currentNumber;
                } else {
                    break;
                }
            }
        } 

        return arr;
    }
}
