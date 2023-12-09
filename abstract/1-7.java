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

    public static double poundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double joulesByWork(double newtons, double meters) {
        return newtons * meters;
    }

    public static double energyMovingPoundsByPlanet(double pounds, double meters, String planet){

        return joulesByWork(forceNewtons(poundsToKg(pounds), planetGravityMpss(planet)), meters);
    }
}
