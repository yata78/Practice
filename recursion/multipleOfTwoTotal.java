class Solution{
    public static int multipleOfTwoTotal(int n){
        
        if (n <= 1){
            return multipleOfTwoTotal(1);
        }

        return multipleOfTwoTotalHelper(n) * 2 + multipleOfTwoTotal(n - 1);
    }

    public static int multipleOfTwoTotalHelper(int n){
        if(n <= 1){
            return 1;
        }

        return multipleOfTwoTotalHelper(n - 1) + n;
    }
}

