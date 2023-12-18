package list;

import java.util.ArrayList;

class Solution{
    public static int[] primeArray(int n){
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                array.add(i);
            }
        }

        int[] answer = new int[array.size() - 1];

        for(int i = 0; i < array.size() -1; i++){
            answer[i] = array.get(i);
        }

        return answer;
    }

    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.floor(n / 2); i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}
