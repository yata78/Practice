package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution{
    public static String[] fireEmployees(String[] employees, String[] unemployed){
        Map<String,Boolean> emplyeeMap= new HashMap<>();

        //�]�ƈ��S�Ă��i�[����B
        for(int i = 0; i < employees.length; i++){
            emplyeeMap.put(employees[i],true);
        }

        //�N�r�ɂ���
        for(int i = 0; i < unemployed.length; i++){
            emplyeeMap.replace(unemployed[i], false);
        }

        ArrayList<String> employeeList = new ArrayList<>();

        for(int i = 0; i < employees.length; i++){
            if(emplyeeMap.get(employees[i])){
                employeeList.add(employees[i]);
            }
        }

        String[] answer = new String[employeeList.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = employeeList.get(i);
        }

        return answer;
    }
}
