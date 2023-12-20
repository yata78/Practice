package list;

class Main{
    public static void getTotalForProductList(double[][] product2dPriceList){
        double finalTotal = 0;
        for (int i = 0; i < product2dPriceList.length; i++){
            double[] priceList = product2dPriceList[i];
            double price = priceList[0];
            double total = price;
            for (int j = 1; j < priceList.length; j++){
                double multiplier = priceList[j];
                total += price * multiplier;
            }
        }

    }

    public static void main(String[] args){
        double[] product1 = {100,0.1,0.2,0.03,0.04};
    }
}
