class Solution{
    public static String calculateLocation(double latitude, double longitude){
        String answer = "";
        if (latitude > 0){
            answer += "north/";
        }else if (latitude < 0) {
            answer += "south/";
        }else {
            answer += "equator/";
        }

        if (longitude > 0){
            answer += "east";
        }else if (longitude < 0) {
            answer += "west";
        }else {
            answer += "prime meridian";
        }


        return answer;
    }
}
