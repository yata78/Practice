class Solution{
    public static int howLongToReachFundGoal(int capitalMoney, int goalMoney, int interest){
        
        return howLongToReachFundGoalHelper(capitalMoney, goalMoney, interest,0);
    }

    public static int howLongToReachFundGoalHelper(int capitalMoney, int goalMoney , int interest , int year){

        //”N”‚É‚æ‚Á‚ÄÅŠz‚ð•ª‚¯‚é
        int tax;
        if (year % 2 == 0){
            tax = 2;
        } else {
            tax = 3;
        }

        if (year >= 80){
            return 80;
        }

        if(capitalMoney >= goalMoney){
            return year;
        }

        return howLongToReachFundGoalHelper(capitalMoney + (capitalMoney * interest / 100), goalMoney + (goalMoney * tax / 100), interest, year + 1);
    }
}
