class Main{

    public static double forceNewtons(double kg, double mpss){
        return kg * mpss;
    }

    public static double planetGravityMpss(String planet){
        if(planet == "Earth"){
            return 9.80665;
        }

        if(planet == "Jupiter"){
            return 24.79;
        }

        if(planet == "Neptune"){
            return 11.15;
        }

        return 0;
    }
    public static void main(String[] args){

        System.out.println(forceNewtons(80, 9.807));

        System.out.println(planetGravityMpss("Neptune"));
        System.out.println(forceNewtons(80, 9.80665));
        System.out.println(forceNewtons(80, planetGravityMpss("Earth")));
        System.out.println(forceNewtons(80, planetGravityMpss("Jupiter")));
        System.out.println(forceNewtons(100,planetGravityMpss("Neptune")));
        System.out.println(forceNewtons(100,0));

    }
}