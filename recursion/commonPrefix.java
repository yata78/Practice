package recursion;

class Solution{
    public static String commonPrefix(String s1, String s2){
        return commonPrefixHelper(s1, s2, 0, "");
    }

    public static String commonPrefixHelper(String s1, String s2, int index, String output){

        if(index > s1.length()-1 || s1.charAt(index)!= s2.charAt(index)){
            return output;
        }

        return commonPrefixHelper(s1, s2, index + 1, output + s1.charAt(index));
    }
}

