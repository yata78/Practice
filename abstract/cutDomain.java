//�h���C���̐؂���

public class cutDomain {
    static String email = "x";

    //�h���C������啶���ŕԂ��֐�
    public static String upperCaseDomain(String email) {
        //"abc@example.com" �� "example.com"
        return email.toUpperCase().substring(email.indexOf("@") + 1);
    }
}
