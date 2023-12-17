package flow;

class Solution{
    public static String redirectionUrl(String language){
        String url = "";
        switch(language){
            case "English":
                url = "www.example.org/en";
                break;
            case "Japanese":
                url = "www.example.org/ja";
                break;
            case "Spanish":
                url = "www.example.org/es";
                break;
            case "Russian":
                url = "www.example.org/ru";
                break;
            default:
                url = "www.example.org/";
        }
        return url;
    }
}
