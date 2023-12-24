package list;

class Solution{
    public static int primesUpToNCount(int n){
        boolean[] cache = new boolean[n];
        for(int i = 0; i < n; i++){
            cache[i] = true;
        }

        cache[0] = false;
        cache[1] = false;

        for(int currentNumber = 2; currentNumber < Math.ceil(Math.sqrt(n)); currentNumber++){

            int i = 2;
            int ip = currentNumber * i;

            while(ip < n){
                cache[ip] = false;
                i++;
                ip = currentNumber * i;
            }
        }

        int count = 0;
        for(int i = 0; i < cache.length; i++){
            if(cache[i]){
                count++;
            }
        }

        return count;
    }
}
