package list;

class Main{

    public static void selectionSort(int[] list){
        int n = list.length;
        for (int i = 0; i < n; i++){
            int minIndex = i;
            for(int j = i + 1; j < n ; j++){
                if (list[j] <= list[minIndex]){
                    minIndex = j;
                }
            }
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }
}
