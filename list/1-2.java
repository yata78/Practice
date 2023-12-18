package list;

class Main{
    public static void printIntArray(int intArr[]){

        for(int i = 0; i < intArr.length; i++){
            System.out.print(intArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = new int[6];
        printIntArray(arr);

        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        int[] arr1 = new int[]{20,13,-12,2,5};
        printIntArray(arr1);

        
    }
}