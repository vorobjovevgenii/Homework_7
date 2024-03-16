import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку:  ");
        String s = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\S+\\.com");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
