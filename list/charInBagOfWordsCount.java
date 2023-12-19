package list;

class Solution{
    public static int charInBagOfWordsCount(String[] bagOfWords, char keyCharacter){
        int count = 0;
        for(int i = 0; i < bagOfWords.length; i++){
            count += charInBagOfWordsCountHelper(bagOfWords[i], keyCharacter);
        }

        return count;
    }

    public static int charInBagOfWordsCountHelper(String word, char keyCharacter){
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == keyCharacter){
                count++;
            }
        }
        return count;
    }
}
