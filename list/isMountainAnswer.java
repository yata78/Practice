package list;

class Main{

    public static boolean isMountain(int[] height){
        int l = height.length;
        if (l <= 0 || height[0] > height[1]) return false;

        int max = (int)-Integer.MAX_VALUE;
        int min = (int)Integer.MAX_VALUE;
        int i = 0;

        while(i <l && max < height[i]){
            max = height[i];
            i++;
        }

        if(i == l || height[i] == max){
            return false;
        }

        while( i < l && height[i] < min){
            min = height[i];
            i++;
        }

        return i == l;
    }
}
