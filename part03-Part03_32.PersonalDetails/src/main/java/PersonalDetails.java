
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int longest = 0;
        String name = "";
        while(true){
            String input = String.valueOf(scanner.nextLine());
            if(input.equals("")){
                break;
            }

            String[] split = input.split(",");
            sum = sum + Integer.valueOf(split[1]);
            count++;
            if(split[0].length() > longest){
                longest = split[0].length();
                name = split[0];
            }
        }
        System.out.println("Longest name: " + name);
        Double average = 1.0 * sum / count;
        System.out.println("Average of the birth years: " + average);

    }
}
