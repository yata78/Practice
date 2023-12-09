class Main {
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

    public static double poundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static void main(String[] args){
        System.out.println(forceNewtons(80, planetGravityMpss("Neptune")));
        
        System.out.println(forceNewtons(poundsToKg(80), planetGravityMpss("Neptune")));

        System.out.println(forceNewtons(poundsToKg(100),planetGravityMpss("Jupiter")));
        
        System.out.println(forceNewtons(poundsToKg(55),planetGravityMpss("Earth")));
                
    }
}
