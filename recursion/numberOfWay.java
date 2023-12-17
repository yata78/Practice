class Solution{
    public static int numberOfWay(int x){
        if(x == 1){
            return 1;
        }

        if(x == 2){
            return 2;
        }

        return numberOfWay(x - 1) + numberOfWay(x - 2);
    }

}