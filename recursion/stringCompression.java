class Solution{
    public static String stringCompression(String s){
        return stringCompressionHelper(s, "", 1, 1, s.charAt(0));
    }

    public static String stringCompressionHelper(String s, String output, int index, int count,Character c){
        
        if(s.length() == 1){
            return s;
        }
        
        if(index >= s.length() -1){
            if(c.equals(s.charAt(index))){
                return output + c + (count + 1);
            } else {
                if (count >= 2){
                    return output + c + count + s.charAt(index);
                } else {
                    return output + c + s.charAt(index);
                }
            }
        } else {
            if(c.equals(s.charAt(index))){
                return stringCompressionHelper(s, output, index + 1, count + 1, c);
            } else {
                if(count >= 2){
                    return stringCompressionHelper(s, output + c + count, index + 1, 1, s.charAt(index));
                } else {
                    return stringCompressionHelper(s, output + c, index + 1, 1, s.charAt(index));
                }
            }
        }

    }
}

