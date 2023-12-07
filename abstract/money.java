class Solution{
    public static int calculateGoalMoney(int capital, int year){
        double moneyRatePerYear = 0;
        if (isEven(capital)){
            moneyRatePerYear = 0.02;
        } else {
            moneyRatePerYear = 0.03;
        }

        return (int)Math.floor(Math.pow(1 + moneyRatePerYear, year) * capital);
    }

    public static boolean isEven(int capital){
        if(capital % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}


