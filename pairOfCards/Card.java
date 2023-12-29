package pairOfCards;

class Card{
    String value;
    String suit;
    int intValue;

    public Card(String value, String suit, int intValue){
        this.value = value;
        this.suit = suit;
        this.intValue = intValue;
    }

    // カードを表示するメソッド　例　?K(13)
    public String getCardString(){
        return this.suit + this.value + "(" + this.intValue + ")";
    }
}
