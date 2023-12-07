//ドメインの切り取り

public class cutDomain {
    static String email = "x";

    //ドメイン名を大文字で返す関数
    public static String upperCaseDomain(String email) {
        //"abc@example.com" → "example.com"
        return email.toUpperCase().substring(email.indexOf("@") + 1);
    }
}
