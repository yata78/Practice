class Solution{

    public static String twosComplement(String bits){
        String twoComplementBits = oneComplement(bits);
        int len = twoComplementBits.length();
        boolean carryOut = false;

        for (int i = len - 1; i >= 0; i--){
            if (twoComplementBits.charAt(i) == '0'){
                twoComplementBits = twoComplementBits.substring(0, i) + '1' + twoComplementBits.substring(i + 1, len);
                carryOut = false;
                break;
            } else {
                twoComplementBits = twoComplementBits.substring(0, i) + '0' + twoComplementBits.substring(i + 1, len);
                carryOut = true;
            }
        }

        return carryOut ? '1' + twoComplementBits : twoComplementBits;
    }
    //ÇPÇÃï‚êîÇãÅÇﬂÇÈ
    public static String oneComplement(String bits){
        String answer = "";
        for(int i = 0; i < bits.length(); i++){
            if(bits.charAt(i) == '0'){
                answer += "1";
            } else {
                answer += "0";
            }
        }
        return answer;
    }
}


