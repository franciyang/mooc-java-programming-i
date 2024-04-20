
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int product = 1;
        int count = 1;
        while(count <= number){
            product = product * count;
            count++;
        }
        System.out.println("Factorial: " + product);
    }
}
