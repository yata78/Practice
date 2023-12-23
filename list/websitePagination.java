package list;

import java.util.ArrayList;

class Solution{
    public static String[] websitePagination(String[] urls, int pageSize, int page){
        
        int finishPageIndex = pageSize * (page - 1);

        int lastPageIndex = 0;
        if(finishPageIndex + pageSize > urls.length){
            lastPageIndex = urls.length;
        } else {
            lastPageIndex = finishPageIndex + pageSize;
        }

        ArrayList<String> urlsList = new ArrayList<String>();

        for(int i = finishPageIndex; i < lastPageIndex; i++){
            urlsList.add(urls[i]);
        }

        String[] answer = new String[urlsList.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = urlsList.get(i);
        }

        return answer;
    }
}
