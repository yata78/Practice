class Solution{
    public static int recursiveDigitsAdded(long digits){
        int current = splitAndAdd(digits, 0);
        if(current < 10){
            return current;
        } else {
            return recursiveDigitsAdded(current) + current;
        }
    }

    public static int splitAndAdd(long digits, int total){

        //digits‚ðˆêŒ…‚¸‚Âtotal‘«‚·
        if(digits / 10 > 0){
            int newTotal =(int)(total + digits % 10);
            return splitAndAdd(digits / 10, newTotal);
        } else {
            return total + (int)digits;
        }
    }
}