package recursion;

class Solution{
    public static int totalSquareArea(int x){

        return totalSquareAreaHelper(x,0); 
    }

    public static int totalSquareAreaHelper(int x, int output){

        if(x <= 0){
            return output;
        }
    
        //–‡”•ª‚Ì–ÊÏ
        return totalSquareAreaHelper(x-1, output + x * x * x);
    }
}
