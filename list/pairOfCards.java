package list;

import java.util.*;

class Solution{

    //�J�[�h����}������菜���A������A,J,Q,K�݂̂̔z����쐬����
    public static String[] generateNumberArr(String[] playerHand){
        String[] rankArr = new String[playerHand.length];
        
        //�}������菜������
        for(int i = 0; i < rankArr.length; i++){
            rankArr[i] = playerHand[i].substring(1);
        }

        return rankArr;
    }

    public static Map<String,Integer> createHashMap(String[] cardPower, String[] numberArr){
        Map<String,Integer> hashmap = new HashMap<>();
        

        //�J�[�h�̋L�^(�S��0��)
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
