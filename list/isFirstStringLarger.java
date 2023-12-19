package list;

class Solution{
    public static boolean isFirstStringLarger(String s1, String s2){
        if(countAscii(s1) > countAscii(s2)){
            return true;
        } else {
            return false;
        }
    }

    public static int countAscii(String s){
        String newS = s.toLowerCase();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            count += newS.charAt(i);
        }

        return count;
    }
}

