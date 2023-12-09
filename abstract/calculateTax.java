class Solution{

    public static double whereStateTax(String state) {
        if (state == "AZ") return 4.9;

        if (state == "CA") return 8.84;

        if (state == "TX") return 0;

        if (state == "NC") return 2.5;

        return 0;
    }

    public static boolean isLeapYaer(int year) {
        if(year % 4 == 0){
            return true;
        }else if ((year % 400 == 0) && (year % 100 != 0)){
            return true;
        }

        return false;
    }

    public static double calculateTax(int profit) {
        return profit * 0.21;
    }

    public static int calculateCorporationTax(String state, int year, int profit){
        int leapYearTax = 1;
        if(isLeapYaer(year)){
            leapYearTax = 0;
        }

        return (int)Math.ceil(whereStateTax(state) * profit + calculateTax(profit) * leapYearTax);
    }
}
