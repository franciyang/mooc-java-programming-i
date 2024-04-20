
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        for(int value = 0; value <= number; value++){
            System.out.println(value);
        }
    }
}
