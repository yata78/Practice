package recursion;

class Solution{
    public static String sheeps(int count){
        
        return sheepsHelper(count, 1, "");
    }

    public static String sheepsHelper(int count , int index, String output){

        if(index > count){
            return output;
        }

        return sheepsHelper(count, index + 1, output + index + " sheep ~ ");
    }
}

