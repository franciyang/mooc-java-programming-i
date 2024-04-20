
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String input = String.valueOf(scanner.nextLine());
        try(Scanner reader = new Scanner(Paths.get(input))){
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                String age = parts[1];
                if(Integer.valueOf(age) > 1){
                    System.out.println(name + ", age: " + age + " years");
                }
                if(Integer.valueOf(age) <= 1){
                    System.out.println(name + ", age: " + age + " years");
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
