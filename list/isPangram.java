package list;

class Solution{
    public static boolean isPangram(String string){
        boolean[] cache = new boolean[26];
        for(int i = 0; i < 26; i++){
            cache[i] = false;
        }

        string = string.toLowerCase().replace(" ", "");
        string = string.replaceAll("-", "");

        for(int i = 0; i < string.length(); i++){
            cache[string.charAt(i) - 97] = true;
        }

        boolean answer = true;
        for(int i = 0; i< 26; i++){
            if(!cache[i]){
                answer = false;
            }
        }

        return answer;
    }
}

