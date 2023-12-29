package list;

import java.util.*;

class Solution{

    //カードから図柄を取り除き、数字とA,J,Q,Kのみの配列を作成する
    public static String[] generateNumberArr(String[] playerHand){
        String[] rankArr = new String[playerHand.length];
        
        //図柄を取り除く処理
        for(int i = 0; i < rankArr.length; i++){
            rankArr[i] = playerHand[i].substring(1);
        }

        return rankArr;
    }

    public static Map<String,Integer> createHashMap(String[] cardPower, String[] numberArr){
        Map<String,Integer> hashmap = new HashMap<>();
        

        //カードの記録(全て0枚)
        for (int i = 0; i < cardPower.length; i++){
            hashmap.put(cardPower[i],0);
        }

        for (int i = 0 ; i < numberArr.length; i++){
            hashmap.replace(numberArr[i], hashmap.get(numberArr[i] + 1));
        }

        return hashmap;
    }


    public static String winnerPairOfCards(String[] player1, String[] player2){
        
        final String[] cardPower = new String[]{"A","K","Q","J","10","9","8","7","6","5","4","3","2"};

        String[] numbers1 = generateNumberArr(player1);
        String[] numbers2 = generateNumberArr(player2);

        Map<String, Integer> hashmap1 = createHashMap(cardPower, numbers1);
        Map<String, Integer> hashmap2 = createHashMap(cardPower, numbers2);

        String winner = "draw";

        int pairOfCards = 0;

        for(int i = 0; i < cardPower.length; i++){

            if(hashmap1.get(cardPower[i]) > hashmap2.get(cardPower[i])){
                if(pairOfCards < hashmap1.get(cardPower[i])){
                    pairOfCards = hashmap1.get(cardPower[i]);
                    winner = "player1";
                }
            }else if(hashmap1.get(cardPower[i]) < hashmap2.get(cardPower[i])){
                if (pairOfCards < hashmap2.get(cardPower[i])){
                    pairOfCards = hashmap2.get(cardPower[i]);
                    winner = "player2";
                }
            }
        }

        return winner;

    }
}
