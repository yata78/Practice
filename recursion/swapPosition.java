package recursion;

class Solution{
    public static String swapPosition(String s){

        return swapPositionHelper(s, 0, "");
    }

    public static String swapPositionHelper(String s, int index, String output){
        if(index >= s.length() -1){
            if(s.length() % 2 != 0){
                return output + s.charAt(s.length()-1);
            } else {
                return output;
            }
        }

        return swapPositionHelper(s, index + 2, output + s.charAt(index + 1) + s.charAt(index));
    }
}