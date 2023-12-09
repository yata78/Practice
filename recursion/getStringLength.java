package recursion;

class Solution{
    public static int lenString(String string){
        if(string.length() == 0){
            return 0;
        }

        return lenString(string.substring(0,string.length()-1)) + 1;
    }
}