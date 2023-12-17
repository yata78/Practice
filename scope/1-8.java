package scope;

class Main{
    public static String message(String inputMessage){
        inputMessage = inputMessage + " - is the message";
        return inputMessage;
    }

    public static void main(String[] args){
        String subject = "It will rain tomorrow";

        String newMessage = message(subject);
        
    }
}
