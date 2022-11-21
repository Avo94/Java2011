import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String someString = scanner.nextLine();
        int someStringLength = someString.length();
        boolean answer = someStringLength > 10;
        System.out.println(answer);
    }
}