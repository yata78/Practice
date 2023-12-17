class Solution{
    public static String divisor(int number){
        
        return divisorHelper(number, "", 1);
    }

    public static String divisorHelper(int number, String output, int count){
        
        if (count >= number){
            return output + number;
        } else {
            if (number % count == 0){
                output += count + "-";  
            } 
            return divisorHelper(number, output, count += 1);
        }
    }
}
