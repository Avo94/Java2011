import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String stringOfAB = scanner.nextLine();
        char[] arrayOfAB = stringOfAB.toCharArray();
        String result = "";

        for (int i = 0; i < stringOfAB.length(); i++) {
            if (arrayOfAB[i] == ('A')) {
                arrayOfAB[i] = 'B';
            } else if (arrayOfAB[i] == ('B')) {
                arrayOfAB[i] = 'A';
            }
            result += arrayOfAB[i];
        }
        System.out.println(result);
    }
}