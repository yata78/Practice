package list;

class  Main{
    public static long tabulationFib(int n){
        long[] cache = new long[n + 1];

        cache[0] = 0;
        cache[1] = 1;

        for (int i = 2; i < n + 1; i++){
            cache[i] = cache[i-1] + cache[i - 2];
        }

        return cache[n];
    }
}