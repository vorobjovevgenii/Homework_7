import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String3 {
    public static void main(String[] args) {

        String str = "ahb acb aeb  aeeb adcb axeb";

        Pattern pattern = Pattern.compile("a\\wb");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
