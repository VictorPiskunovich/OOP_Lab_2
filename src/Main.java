import java.util.regex.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // проверка на соответствие строки шаблону
        Pattern p1 = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        String str  = "abcdefghijklmnopqrstuv18340";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "12334567890";
        System.out.println(str + ": " + p1.matcher(str).matches());

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите строку:");
        str = sc1.nextLine();
        System.out.println(str + ": " + p1.matcher(str).matches());
    }
}