package object;

public class Tax {
    public String name;
    public double federalTax;
    public double stateTax;
    public double localTax;

    public Tax(String name, double federalTax, double stateTax, double localTax){
        this.name = name;
        this.federalTax = federalTax;
        this.stateTax = stateTax;
        this.localTax = localTax;;
    }
}

class Main{
    public static void main(String[] args){
        Tax taxLasVegas = new Tax("Las Vegas Taxes", 0.02,0.05,0.01);
    }
}
