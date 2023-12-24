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
        //i��i+1�̐��������Đ����𔻒f���邽�߁Afor����length()-1�܂łɂ���
        for(int i = 0; i < romanNumber.length() - 1; i++){
           if(roman.get(romanNumber.charAt(i)) < roman.get(romanNumber.charAt(i + 1))){
                sum +=  -roman.get(romanNumber.charAt(i));
           } else {
                sum += roman.get(romanNumber.charAt(i));
           } 
        }

        //�Ō�̐����𑫂�
        sum += roman.get(romanNumber.charAt(romanNumber.length()-1));
        
        return sum;
    }
}
