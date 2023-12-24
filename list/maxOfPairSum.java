package list;


//‘S’Tõ
class Solution{
    public static String maxOfPairSum(int[] arr1, int[] arr2, int x){
        int max = -Integer.MAX_VALUE;

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] + arr2[j] > max && arr1[i] + arr2[j] < x){
                    max = arr1[i] + arr2[j];
                }
            }
        }

        return max != -Integer.MAX_VALUE ? String.valueOf(max) : "no pair"; 
    }
}
