
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while(true){
            String input = String.valueOf(scanner.nextLine());
            if(input.equals("")){
                break;
            }

            String[] split = input.split(",");
            if(Integer.valueOf(split[1]) > max){
                max = Integer.valueOf(split[1]);
            }
        }

        System.out.println("Age of the oldest: " + max);

    }
}
