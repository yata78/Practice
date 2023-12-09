class Solution{

    public static double planetGravityMpss(String planet) {
        if(planet == "Earth"){
            return 9.8;
        }

        if(planet == "Jupiter"){
            return 24.79;
        }

        if(planet == "Mars"){
            return 3.71;
        }

        if(planet == "Pluto"){
            return 0.58;
        }

        if(planet == "Moon"){
            return 1.62;
        }

        return 0;
    }

    public static double calculateMaxSpeed(int height, double mpss){
        return Math.pow(2 * mpss * height, 0.5);
    }

    public static String getEmotion(int height, String planet) {
        double speed = calculateMaxSpeed(height, planetGravityMpss(planet));

        if(planetGravityMpss(planet) == 0){
            return "no data";
        }

        if(speed >= 80){
            return "terrified";
        } else if (speed >= 60) {
            return "frighten";
        } else if (speed >= 40){
            return "scared";
        } else {
            return "afraid";
        }
    }
}
