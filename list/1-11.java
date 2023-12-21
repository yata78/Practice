package list;

import java.util.ArrayList;

class Main{
    public static int randomInt(int min, int max) {
        return (int)(Math.random()*(max - min + 1) + min);
    }

    public static void printArray(ArrayList<Integer> arrayList) {
        String string = "[";
        for (int i = 0; i < arrayList.size(); i++) {
            string += arrayList.get(i) + " ";
        }
        System.out.println(string + "]");
    }

    public static ArrayList<Integer> chooseNFromBags1d(int n, int[] bagOfNumbers, int totalBags, int numbersPerBag){
        ArrayList<Integer> chosenNumbers = new ArrayList<Integer>();
        int counter = 0;
        while(counter < n){

            int currentBagStart = (counter % totalBags) * numbersPerBag;
            int currentBagEnd = currentBagStart + numbersPerBag;

            chosenNumbers.add(bagOfNumbers[randomInt(currentBagStart, currentBagEnd - 1)]);
            counter += 1;
        }

        return chosenNumbers;

    }
}
