package pairOfCards;

import java.util.*;

class Dealer{

    public static ArrayList<ArrayList<Card>> startGame(Table table){

        Deck deck = new Deck();
        deck.shuffleCard();

        ArrayList<ArrayList<Card>> playerCards = new ArrayList<>();

        for(int i = 0; i < table.amountOfPlayers; i++){
            ArrayList<Card> playerHand = new ArrayList<>();
            for(int j = 0; j < Dealer.initialCards(table.gamemode); j++){
                Card card = deck.draw();
                playerHand.add(card);
            }
        }

        return playerCards;
    }

    //gameModeに応じて、手札の枚数を返す
    public static int initialCards(String gameMode){
        if (gameMode == "poker") return 5;
        if (gameMode == "21") return 2;
        if (gameMode == "Pair of Cards") return 5;
        else return 0;
    }

    // ゲームの勝敗を決める関数
    public static String winnerPairOfCards(ArrayList<ArrayList<Card>> playerCards, Table table){
        // 同じ数字をたくさん持っているプレイヤーの勝ち
        // 枚数が同じなら数字が大きいプレイヤーの勝ち

        // カードの強さ : 2 < 3 < 4 < 5 < 6 … J < Q < K < A
        final int[] cardPower = new int[]{1, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

        //数字だけの配列を作ります。
        int[] numbers1 = Helperfunction.generateNumberArr(playerCards.get(0));
        int[] numbers2 = Helperfunction.generateNumberArr(playerCards.get(1));

        // プレイヤーのカードをハッシュマップにします。
        Map<Integer, Integer> hashmap1 = Helperfunction.createHashmap(cardPower, numbers1);
        Map<Integer, Integer> hashmap2 = Helperfunction.createHashmap(cardPower, numbers2);
        
        // デフォルトで引き分けを返します。
        String winner = "draw.";
        //　同じランクのカードの枚数を記録します。
        int pairOfCards = 0;

        for(int i = 0; i < cardPower.length; i++){
            // それぞれのhashmapをcardPowerの強い順に比較していきます。0または同じ枚数の時は次のランクへ。
            // プレイヤー1が持つ同じランクのカードが多いとき
            if(hashmap1.get(cardPower[i]) > hashmap2.get(cardPower[i])){
                // 記録しているカードの枚数よりプレイヤー1が持つカードの枚数が多かったら、
                if (pairOfCards < hashmap1.get(cardPower[i])){
                    // pairOfCardsとwinnerをプレイヤー1に書き換えます。
                    pairOfCards = hashmap1.get(cardPower[i]);
                    winner = "player 1.";
                }
            }else if(hashmap1.get(cardPower[i]) < hashmap2.get(cardPower[i])){
                if (pairOfCards < hashmap2.get(cardPower[i])){
                    pairOfCards = hashmap2.get(cardPower[i]);
                    winner = "player 2.";
                }
            }
        }
        System.out.println("The winner of this game is ");
        return winner;
    }
}

class Helperfunction{

    // 数字だけの配列を作ります。
    public static int[] generateNumberArr(ArrayList<Card> playerhand){
        int[] intArr = new int[playerhand.size()];
        for(int i = 0; i < playerhand.size(); i++){
            intArr[i] = playerhand.get(i).intValue;
        }
        return intArr;
    }
    
    // Hashmapを作成します。
    public static Map<Integer, Integer> createHashmap(int[] cardPower, int[] numberArr) {

        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < cardPower.length; i++) {
            hashmap.put(cardPower[i], 0);
        }
        for(int i = 0; i < numberArr.length; i++){
            hashmap.replace(numberArr[i], hashmap.get(numberArr[i]) + 1);
        }
        return hashmap;
    }    
}
