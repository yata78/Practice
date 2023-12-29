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

    //gameMode�ɉ����āA��D�̖�����Ԃ�
    public static int initialCards(String gameMode){
        if (gameMode == "poker") return 5;
        if (gameMode == "21") return 2;
        if (gameMode == "Pair of Cards") return 5;
        else return 0;
    }

    // �Q�[���̏��s�����߂�֐�
    public static String winnerPairOfCards(ArrayList<ArrayList<Card>> playerCards, Table table){
        // �����������������񎝂��Ă���v���C���[�̏���
        // �����������Ȃ琔�����傫���v���C���[�̏���

        // �J�[�h�̋��� : 2 < 3 < 4 < 5 < 6 �c J < Q < K < A
        final int[] cardPower = new int[]{1, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

        //���������̔z������܂��B
        int[] numbers1 = Helperfunction.generateNumberArr(playerCards.get(0));
        int[] numbers2 = Helperfunction.generateNumberArr(playerCards.get(1));

        // �v���C���[�̃J�[�h���n�b�V���}�b�v�ɂ��܂��B
        Map<Integer, Integer> hashmap1 = Helperfunction.createHashmap(cardPower, numbers1);
        Map<Integer, Integer> hashmap2 = Helperfunction.createHashmap(cardPower, numbers2);
        
        // �f�t�H���g�ň���������Ԃ��܂��B
        String winner = "draw.";
        //�@���������N�̃J�[�h�̖������L�^���܂��B
        int pairOfCards = 0;

        for(int i = 0; i < cardPower.length; i++){
            // ���ꂼ���hashmap��cardPower�̋������ɔ�r���Ă����܂��B0�܂��͓��������̎��͎��̃����N�ցB
            // �v���C���[1�������������N�̃J�[�h�������Ƃ�
            if(hashmap1.get(cardPower[i]) > hashmap2.get(cardPower[i])){
                // �L�^���Ă���J�[�h�̖������v���C���[1�����J�[�h�̖���������������A
                if (pairOfCards < hashmap1.get(cardPower[i])){
                    // pairOfCards��winner���v���C���[1�ɏ��������܂��B
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

    // ���������̔z������܂��B
    public static int[] generateNumberArr(ArrayList<Card> playerhand){
        int[] intArr = new int[playerhand.size()];
        for(int i = 0; i < playerhand.size(); i++){
            intArr[i] = playerhand.get(i).intValue;
        }
        return intArr;
    }
    
    // Hashmap���쐬���܂��B
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
