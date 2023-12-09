class Solution {

    public static boolean isValidCard(String card) {
        if((card != "Visa") && (card != "MasterCard")){
            return false;
        }
        return true;
    }

    public static double calculateTips(int cost){
        if(cost % 3 == 0){
            return 0.03;
        } else if (cost % 5 == 0) {
            return 0.05;
        } else if (cost % 7 == 0) {
            return 0.07;
        }

        return 0.10;
    }

    public static double calculateTotal(int cost){

        return (calculateTips(cost) + 0.1 + 1) * cost; 
    }

    public static boolean isSafe(double total){
        if(total < 300){
            return true;
        } else {
            return false;
        }
    }

    public static double processPayment(String creditCardType, int cost) {
        if(!isValidCard(creditCardType)){
           return -1; 
        }

        double total = calculateTotal(cost);

        if(isSafe(total)){
            return total;
        } else {
            return -1;
        }
    }
}