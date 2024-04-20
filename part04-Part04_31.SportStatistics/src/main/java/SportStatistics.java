
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String input = String.valueOf(scan.nextLine());
        System.out.println("Team:");
        String team = String.valueOf(scan.nextLine());
        int count = 0;
        int wcount = 0;
        int lcount = 0;
        try(Scanner reader = new Scanner(Paths.get(input))){
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] parts = line.split(",");
                String home = parts[0];
                String visit = parts[1];
                int hpoints = Integer.valueOf(parts[2]);
                int vpoints = Integer.valueOf(parts[3]);

                if(home.equals(team)){
                    count++;
                    if(hpoints > vpoints){
                        wcount++;
                    }else if(hpoints < vpoints){
                        lcount++;
                    }
                }else if(visit.equals(team)){
                    count++;
                    if(vpoints > hpoints){
                        wcount++;
                    }else if(vpoints < hpoints){
                        lcount++;
                    }
                }
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + wcount);
        System.out.println("Losses: " + lcount);
    }

}
