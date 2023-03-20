import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String variable = sc.nextLine();
        String result = Calculator.calc(variable);
        System.out.println(result);
    }
}