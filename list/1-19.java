package list;

class Main{
    public static void inserionSort(int[] list){
        int n = list.length;

        for (int i = 1; i < n ; i++){
            int currentValue = list[i];

            for (int j = i - 1; j >= 0; j--){

                if (currentValue <= list[j]){
                    list[j + 1] = list[j];
                    list[j] = currentValue;
                }
                else break;
            }
        }
    }
}
