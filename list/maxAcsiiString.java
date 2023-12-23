package list;

class Solution{
    public static int maxAscilString(String[] stringList){
        
        int sumAscii = 0;
        int index = 0;
        
        for(int i = 0; i < stringList.length; i++){
            int tmpAscii = 0;
            for(int j = 0; j < stringList[i].length(); j++){
                tmpAscii += stringList[i].charAt(j);
            }
            if(tmpAscii > sumAscii){
                sumAscii = tmpAscii;
                index = i;
            }
        }

        return index;
    }
}

