package list;

class Animal{
    public String species;
    public double weightKg;
    public double heightM;
    public boolean predator;

    public Animal(String species, double weightKg, double heightM, boolean predator){
        this.species = species;
        this.weightKg = weightKg;
        this.heightM = heightM;
        this.predator = predator;
    }

    public void domesticate(){
        this.predator = false;
    }
}

class Hunter{
    public String name;
    public int age;
    public double weightKg;
    public double heightM;
    public double strength;
    public double cageCubicMeters;

    public double strengthKg (){
        return this.weightKg * this.strength;
    }

    public Hunter(String name, int age, double weightKg, double heightM, double strength, double cageCubicMeters){
        this.name = name;
        this.age = age;
        this.weightKg = weightKg;
        this.heightM = heightM;
        this.strength = strength;
        this.cageCubicMeters = cageCubicMeters;
    }

    public boolean canCaptureAnimal(Animal animal){
        if((this.strengthKg()>= animal.weightKg && this.cageCubicMeters >= animal.heightM) && !animal.predator){
            return true;
        } else {
            return false;
        }
    }

    public boolean attemptToDomesticate(Animal animal){
        if(this.strengthKg() <= animal.weightKg * 2){
            return false;
        } else {
            animal.domesticate();
            return true;
        }
    }
}



class Main{
    public static void printAnimal(Animal animal){
        System.out.println("The animal species is: " + animal.species + ". It's weight is: " + animal.weightKg + "kg and its height is: " + animal.heightM + "m. " + ((animal.predator) ? "It is a predator!" : "It is a peaceful animal."));
    }

    public static void main(String[] args){
        Animal tiger1 = new Animal("Tiger", 290, 2.6, true);
        Animal bear1 = new Animal("Bear", 250, 2.8, true);
        Animal snake1 = new Animal("Snake", 250, 12.8, true);
        Animal dog1 = new Animal("Dog", 90, 1.2, false);
        Animal cat1 = new Animal("Cat", 40, 0.5, false);
        Animal cow1 = new Animal("Cow", 1134, 1.5, false);

        printAnimal(tiger1);
        printAnimal(bear1);
        printAnimal(cat1);

        System.out.println("Time to tame the tiger...");
        
        // tiger の状態を捕食者から変え、文字列が predator から peaceful animal になるのを確認しましょう
        tiger1.domesticate();
        printAnimal(tiger1);
    }
}