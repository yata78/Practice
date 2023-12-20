package list;

import java.util.ArrayList;

class Main{
    public static int randomInt(int min, int max) {
        return (int)(Math.random()*(max - min + 1) + min);
    }

    public static void printArray(ArrayList<Integer> arrayList){
        String string = "[";
        for (int i = 0; i < arrayList.size(); i++){
            string += arrayList.get(i) + " ";
        }
        System.out.println(string + "]");
    }

    public static ArrayList<Integer> chooseNFromBags2d(int n , int[][] listOfBags){
        int totalBags = listOfBags.length;
        ArrayList<Integer> chosenNumbers = new ArrayList<Integer>();
        int count = 0;
        while (count < n) {
            int[] cuurentBag = listOfBags[ count % totalBags];
            chosenNumbers.add(cuurentBag[randomInt(0, cuurentBag.length - 1)]);
            count++;
        }
        return chosenNumbers;
    }
}
