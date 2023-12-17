class Solution{
    public static int kthElement(int n , int k){

        if (n == 1){
            return 0;
        }

        if (k % 2 == 0){
            if (kthElement(n - 1, k /2) == 0){
                return 0;
            }  else {
                return 1;
            }
        } else {
            if (kthElement(n- 1, (k + 1) / 2) == 0){
                return 1;
            } else {
                return 0;
            }
        }
    }
}