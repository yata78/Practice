class Solution{
    public static int splitAndAdd(int digits){
        
        return splitAndAddHelper(digits, 0);
    }

    public static int splitAndAddHelper(int digits , int output){
        if (digits / 10 <= 0){
            return output + digits;
        }

        return splitAndAddHelper(digits /10, output + digits % 10);
    }
}
