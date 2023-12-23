package list;

class Solution{
    public static boolean isMountain(int[] height){

        if(height.length < 3){
            return false;
        }

        if(height[0] > height[1]){
            return false;
        }

        boolean isUp = true;
        boolean isDown = false;

        int nowMountainHeight = 0;

        for(int i = 0; i < height.length ; i++){
            if(isUp){
                if(nowMountainHeight < height[i]){
                    nowMountainHeight = height[i];
                } else if (nowMountainHeight > height[i]){
                    nowMountainHeight = height[i];
                    isUp = false;
                    isDown = true;
                } else {
                    isUp = true;
                    isDown = false;
                    break;
                }
            } else {
                if(nowMountainHeight > height[i]){
                    nowMountainHeight = height[i];
                    isDown = true;     
                } else {
                    isDown = false;
                    break;
                }
            }
        }


        return (!isUp && isDown);
    }
}
