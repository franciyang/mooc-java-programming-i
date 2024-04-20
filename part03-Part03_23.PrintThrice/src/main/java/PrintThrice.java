
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word:");
        String input = String.valueOf(scanner.nextLine());
        int count = 0;
        while(count < 3){
            System.out.print(input);
            count++;
        }

    }
}
