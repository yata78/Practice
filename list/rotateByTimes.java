package list;

class Solution{
    public static int[] rotateByTimes(int[] ids, int n){
        int[] newids = new int[ids.length * 2];

        for(int i = 0; i < newids.length; i++){
            newids[i] = ids[i % (ids.length)];
        }

        int index = n % (ids.length);

        int[] answer = new int[ids.length];

        int answerindex = 0;

        for(int i = ids.length - index; i < 2 * ids.length - index; i++){
            answer[answerindex] = newids[i];
            System.out.println(newids[i]);
            answerindex++;
        }

        return answer;
    }
}
