import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a:  ");
        int a = scanner.nextInt();
        System.out.print("Введите число b:  ");
        int b = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d + %d = %d \n", a, b, a + b))
                .append(String.format("%d - %d = %d \n", a, b, a - b))
                .append(String.format("%d * %d = %d \n", a, b, a * b));


        System.out.println(sb.toString());

        while (sb.indexOf("=") >= 0){
            int r = sb.indexOf("=");
            sb.replace(r,r+1,"равно");
        }
        System.out.println(sb.toString());
    }

}