
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldest = "";
        int max = 0;
        while(true){
            String input = String.valueOf(scanner.nextLine());
            if(input.equals("")){
                break;
            }

            String[] split = input.split(",");
            if(Integer.valueOf(split[1]) > max){
                oldest = split[0];
                max = Integer.valueOf(split[1]);
            }
        }

        System.out.println("Name of the oldest: " + oldest);

    }
}
