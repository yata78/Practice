package pairOfCards;

import java.util.ArrayList;

class Deck{
    ArrayList<Card> deck;

    public Deck(){
        this.deck = this.generateDeck();
    }

    public static ArrayList<Card> generateDeck(){
        ArrayList<Card> newDeck = new ArrayList<>();
        String[] suits = new String[]{"?", "?", "?", "?"};
        String[] values = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for(int i = 0; i < suits.length; i++){
            for(int j = 0; j < values.length; j++){
                newDeck.add(new Card(suits[i], values[j], j + 1));
            }
        }
        return newDeck;
    }

    // �J�[�h��\�����郁�\�b�h
    public void printDeck(){
        System.out.println("Displaying cards...");
        for (int i = 0; i < this.deck.size(); i++) {
            System.out.println(this.deck.get(i).getCardString());
        }
    }

    //�J�[�h���V���b�t������
    public void shuffleCard(){
        for(int i = this.deck.size(); i > 0; i--){
            int r = (int)Math.floor(Math.random() * i - 1);
            Card tmp = deck.get(r);
            deck.set(r, deck.get(i));
            deck.set(i,tmp);
        }
    }

    //�J�[�h��1������
    public Card draw(){
        return this.deck.remove(this.deck.size() - 1);
    }
}
