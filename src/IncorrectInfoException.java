public class IncorrectInfoException extends Exception{

    private int age;
    private String fullName;

    public IncorrectInfoException(String message, String fullName) {
        super(message);
        this.fullName = fullName;
    }
    public IncorrectInfoException(String message, int age) {
        super(message);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String returnFullName() {
        return fullName;
    }

}