package list;

import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        ArrayList<Integer> dArr = new ArrayList<Integer>();

        dArr.add(2);
        dArr.add(3);

        dArr.add(0,3);

        dArr.add(1,43);

        dArr.remove(0);

        dArr.set(1,100);

        dArr.add((int)(Math.floor(dArr.size()/2)), 100);

        dArr.add(222);

        dArr.remove(dArr.size() - 1);
    }
}
