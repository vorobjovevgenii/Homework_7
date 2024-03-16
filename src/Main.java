import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName;
        int age;

        try {

            System.out.print("Введите ФИО: ");
            fullName = scanner.nextLine();
            checkFullName(fullName);

            System.out.print("Введите возраст: ");
            age = scanner.nextInt();
            checkAge(age);

        } catch (IncorrectInfoException ex){
            ex.printStackTrace();

        } catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }


    }
    public static void checkFullName(String fullName) throws IncorrectInfoException{
        String msg = "ФИО введено некорректно: ";
        int max = 100;
        String symbols = "[a-zA-Zа-яА-Я]";
        String badSymbols = "^(.|,|!|&)$";

        if (fullName.length() > max){
            msg += "длина больше " + max;
            throw new IncorrectInfoException(msg, fullName);
        }

        Pattern pattern = Pattern.compile(badSymbols);
        Matcher matcher = pattern.matcher(fullName);

        if (matcher.find()){
            msg += "содержит недопустимые символы (спецсимволы) " + badSymbols;
            throw new IncorrectInfoException(msg, fullName);
        }

    }
    public static void checkAge(int age) throws IncorrectInfoException{
        String msg = "Возраст введен некорректно: ";

        if (age > 100 || age < 0){
            msg += "указан недопустимый возраст " + age;
            throw new IncorrectInfoException(msg, age);
        }
    }
}