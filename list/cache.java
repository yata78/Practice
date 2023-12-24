package list;

import java.util.ArrayList;

class Main{
    //エラトステネスの篩
    public static int[] allNPrimeSieve(int n){

        boolean[] cache = new boolean[n];
        for(int i = 0; i < n ; i++){
            cache[i] = true;
        }

        for (int currentPrime = 2; currentPrime < Math.ceil(Math.sqrt(n)); currentPrime++){

            if(!cache[currentPrime]) continue;
            int i = 2;
            int ip = i * currentPrime;
            while (ip < n){
                cache[ip] = false;
                i++;
                ip = i * currentPrime;
            }
        }

        ArrayList<Integer> primeNumbersDynamic = new ArrayList<Integer>();
        for (int i = 2; i < cache.length; i++){
            if(cache[i]){
                primeNumbersDynamic.add(i);
            }
        }

        int[] primeNumbers = new int[primeNumbersDynamic.size()];
        for (int i = 0; i < primeNumbersDynamic.size(); i++){
            primeNumbers[i] = primeNumbersDynamic.get(i);
        }

        return primeNumbers;
    }
}
