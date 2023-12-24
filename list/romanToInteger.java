package list;

import java.util.*;

class Solution{
    public static int romanToInteger(String romanNumber){
        Map<Character, Integer> roman = new HashMap<Character, Integer>();

        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        int sum = 0;
        //i‚Íi+1‚Ì”š‚ğŒ©‚Ä³•‰‚ğ”»’f‚·‚é‚½‚ßAfor•¶‚Ílength()-1‚Ü‚Å‚É‚·‚é
        for(int i = 0; i < romanNumber.length() - 1; i++){
           if(roman.get(romanNumber.charAt(i)) < roman.get(romanNumber.charAt(i + 1))){
                sum +=  -roman.get(romanNumber.charAt(i));
           } else {
                sum += roman.get(romanNumber.charAt(i));
           } 
        }

        //ÅŒã‚Ì”š‚ğ‘«‚·
        sum += roman.get(romanNumber.charAt(romanNumber.length()-1));
        
        return sum;
    }
}
