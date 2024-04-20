
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int count = 0;
        while(count <= last){
            sum += count;
            count++;
            
        }
        System.out.println("The sum is " + sum);
    }
}
