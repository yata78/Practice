class Main{
    
    public static boolean containsAtSymbol(String email) {
        return email.contains("@");
    }

    public static boolean containsDotSymbol(String email) {
        return email.contains(".");
    }

    public static boolean isValidEmail(String email) {
        return containsAtSymbol(email) && containsDotSymbol(email);
    }
}
