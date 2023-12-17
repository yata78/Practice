class Main{

    public static String firstName = "Masamune";
    public static String lastName = "Watanabe";

    public static String userName(){

        String firstName = "Emily";
        String lastName = "Robertson";

        return firstName + " - " + lastName;
    }

    public static void main(String[] args){
        System.out.println(firstName + " - " + lastName);

        String firstName = "Fernando";
        String lastName = "Yamato";
        System.out.println(firstName + " - " + lastName);

        System.out.println(userName());

        // •Ï”‚Ìã‘‚«
        firstName = "Andy";
        lastName = "Jordan";
        System.out.println(firstName + " - " + lastName);
    }


}