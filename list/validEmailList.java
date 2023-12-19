package list;

import java.util.ArrayList;

class Solution{
    public static String[] validEmailList(String[] emailList){
        
        ArrayList<String> emailArrayList = new ArrayList<String>();

        for(int i = 0; i < emailList.length; i++){
            if(isValid(emailList[i])){
                emailArrayList.add(emailList[i]);
            }
        }

        String[] answer = new String[emailArrayList.size()];

        for(int i = 0; i < emailArrayList.size(); i++){
            answer[i] = emailArrayList.get(i);
        }

        return answer;
    }

    public static boolean isValid(String email){
        //スペースが無いこと
        if(email.contains(" ")){
            return false;
        }

        //@を1つのみ含んでいること
        if(email.substring(email.indexOf("@") + 1).contains("@")){
            return false;
        }

        if(!email.substring(email.indexOf("@")).contains(".")){
            return false;
        }

        if(email.charAt(0) == '@'){
            return false;
        }

        return true;
    }
}
