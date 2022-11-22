import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String stringOfAB = scanner.nextLine();

        stringOfAB = stringOfAB.replace('B', 'X');
        stringOfAB = stringOfAB.replace('A', 'B');
        stringOfAB = stringOfAB.replace('X', 'A');

        System.out.println(stringOfAB);
    }
}