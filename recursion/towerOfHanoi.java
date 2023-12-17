class Solution{
    public static int towerOfHanoi(int discs){
        if(discs == 1){
            return 1;
        }

        return towerOfHanoi(discs - 1) + towerOfHanoi(discs - 2);
    }
}

