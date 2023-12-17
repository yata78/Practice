class Solution{
    public static int maximumPeople(int x, int y){
        if(x % y == 0){
            return y;
        } else {
            return maximumPeople(y, x % y);
        }
    }
}
