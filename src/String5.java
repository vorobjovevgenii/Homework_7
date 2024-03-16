import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбрать существующие даты между 1000 и 2012 годом. Секунды могут быть опущены. " +
                "В каждом месяце 30 дней. Формат: yyyy/MM/dd HH:mm ");
        String day = scanner.nextLine();
//
        Pattern pattern = Pattern.compile("^(1[0-9]{3}|20(0[0-9]|1[0-2]))/" +
                "(0[1-9]|1[0-2])/([0-2][0-9]|30)\\s([0-1][0-9]|2[0-3]):[0-5][0-9]$");

        Matcher matcher = pattern.matcher(day);
        if (matcher.find()){
            System.out.println(matcher.group() + " –  существует");
        }else{
            System.out.println(day + " –  не существует");
        }
    }
}
