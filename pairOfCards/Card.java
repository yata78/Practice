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

    // �J�[�h��\�����郁�\�b�h�@��@?K(13)
    public String getCardString(){
        return this.suit + this.value + "(" + this.intValue + ")";
    }
}
