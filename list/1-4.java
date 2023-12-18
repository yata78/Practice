package list;

class Main{
    public static int totalFoundInSentence(String[] sentences, char c){
        for (int i = 0; i < sentences.length; i++){
            String currentSentence = sentences[i];
            for (int j = 0; j < currentSentence.length(); j++){
                if(Character.toLowerCase(currentSentence.charAt(i)) == Character.toLowerCase(c)){
                    count += 1;
                    break;
                }
            }
        }
    }
}
