package recursion;

class Main{
    public static int lengthOfString(String s){
        if (s.isEmpty()){
            return 0;
        }

        return lengthOfString(s.substring(0,s.length()-1)) + 1;
    }
}
