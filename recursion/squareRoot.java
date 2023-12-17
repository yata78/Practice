import java.lang.Math;

class Main{


    public static boolean isSquareRootCloseEnough(double a, double b){

        return 100 * Math.abs((a - b) / b) < 0.01;
    }

    public static double squareRootHelper(double x, double guess) {

        double newGuess = (guess + x/guess)/2;

        if(isSquareRootCloseEnough(newGuess, guess)) return newGuess;

        return squareRootHelper(x, newGuess);
    }
}