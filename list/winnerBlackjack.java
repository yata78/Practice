package list;

class Solution{
    public static boolean winnerBlackjack(String[] playerCards, String[] houseCards){
        int userValue = haveCardsValue(playerCards);
        int houseValue = haveCardsValue(houseCards);

        System.out.println(userValue);

        if(userValue > 21){
            return false;
        }

        if(houseValue >= userValue && houseValue < 22){
            return false;
        }

        return true;
    }

    public static int haveCardsValue(String[] Cards){
        int count = 0;
        for(int i = 0; i < Cards.length; i++){
            switch (Cards[i].substring(1)) {
                case "J":
                    count += 11;
                    break;
                case "Q":
                    count += 12;
                    break;
                case "K":
                    count += 13;
                    break;
                case "A":
                    count += 1;
                    break;
                default:
                    count += Integer.parseInt(Cards[i].substring(1));
                    break;
            }
        }

        return count;
    }
}
