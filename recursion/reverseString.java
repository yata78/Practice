package recursion;

class Solution{
    public static String reverseString(String s){
        
        return reverseStringHelper(s, s.length()-1, "");
    }

    public static String reverseStringHelper(String s, int index, String output){
        if(index < 0){
            return output;
        }

        return reverseStringHelper(s, index -1, output + s.charAt(index));
    }
}
