package recursion;

class Solution{
    public static String mergeString(String s1, String s2){
        return mergeStringHelper(s1, s2, 0,"");
    }

    public static String mergeStringHelper(String s1, String s2, int index, String output) {
        if(index > s1.length()-1) return output;

        return mergeStringHelper(s1, s2, index + 1, output+ s1.charAt(index) + s2.charAt(index)); 
    }
}
