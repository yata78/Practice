class Main{

    public static String doubleSubstring(String string) {
        return string + string;
    }

    public static void main(String[] args){
        String message = "hello";

        System.out.println(message);
        
        System.out.println(doubleSubstring(message));
        
        System.out.println(doubleSubstring(message).substring(1));

        String mail = "recursion@info.com";

        //COM��Ԃ�
        System.out.println(mail.toUpperCase().substring(15));

        //%INFO.COM��Ԃ�
        System.out.println(mail.replace("recursion@","%").toUpperCase());

        //RecuRsion���o��
        System.out.println(mail.substring(0,9).replace("r","R"));

    }
}
