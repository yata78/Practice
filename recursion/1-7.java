class main{

    public static int simpleSummationTail(int n){
        return simpleSummationTailHelper(n,0);
    }

    public static int simpleSummationTailHelper(int count, int total){

        if(count <= 0){
            return total;
        }

        return simpleSummationTailHelper(count + 1, total + count);
    }
    
}
