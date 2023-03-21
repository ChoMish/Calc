import java.util.Scanner;

public class Calculator {
    public static void calc(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String variable = sc.nextLine();
        String result = Main.main(variable);
        System.out.println(result);
    }
}