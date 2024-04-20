import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Name:");
            String name = String.valueOf(scanner.nextLine());
            if(name.isEmpty()){
                break;
            }
            System.out.println("Duration:");
            String duration = String.valueOf(scanner.nextLine());
            int durationInt = Integer.valueOf(duration);
            programs.add(new TelevisionProgram(name, durationInt));
        }

        System.out.println("Program's maximum duration?");
        int max = Integer.valueOf(scanner.nextLine());
        for(TelevisionProgram count : programs){
            if(count.getDuration() <= max){
                System.out.println(count.toString());
            }
        }
            
        
    }
}
