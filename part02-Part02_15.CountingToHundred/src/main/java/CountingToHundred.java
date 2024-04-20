
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.valueOf(scanner.nextLine());
        for(int value = start; value <= 100; value++){
            System.out.println(value);
        }
    }
}
