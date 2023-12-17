class Main{

    public static int simpleSummation(int count) {

        if(count <= 0){
            return 0;
        }

        return simpleSummation(count - 1);
    }

    public static int simpleSummationOfSummation(int count) {

        if(count <= 0){
            return 0;
        }

        return simpleSummation(count) + simpleSummationOfSummation(count - 1);
    }


}