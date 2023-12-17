class Solution{
    public static boolean recursiveIsPalindrome(String s){
        String newS = s.replaceAll("@| ", "").toLowerCase();
        return recursiveIsPalindrome(newS, 0);
    }

    public static boolean recursiveIsPalindrome(String s, int index){

        if(index > Math.ceil(s.length() / 2)){
            return true;
        }

        if(s.charAt(index) != s.charAt(s.length() - index - 1)){
            return false;
        }

        return recursiveIsPalindrome(s, index + 1);
    }
}