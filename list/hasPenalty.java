package list;

class Solution{
    public static boolean hasPenalty(int[] records){
        int max = records[0];
        boolean ishasPenalty = false;
        for(int i = 1; i < records.length; i++){
            if(max <= records[i]){
                max = records[i];
            } else {
                ishasPenalty = true;
            }
        }

        return ishasPenalty;
    }
}
