class Solution{

    public static double planetGravityMpss(String planet) {
        if (planet == "Earth") {
            return 9.8;
        } else if (planet == "Jupiter") {
            return 24.79;
        } else if (planet == "Mercury") {
            return 3.7;
        } else {
            return 0;
        }
    }

    public static double changeMetersToMile(double h) {
        return h * 0.00062137;
    }

    public static int fallingDistance(String planet, int time) {
        return (int)Math.floor(changeMetersToMile(planetGravityMpss(planet) * time * time /2));
    }
}
