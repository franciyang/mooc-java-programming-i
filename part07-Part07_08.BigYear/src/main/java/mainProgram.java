
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<> ();
        while(true){
            System.out.println("?");
            String command1 = String.valueOf(scan.nextLine());
            if(command1.equals("Quit")){
                break;
            }else if(command1.equals("Add")){
                System.out.println("Name:");
                String name1 = String.valueOf(scan.nextLine());
                System.out.println("Name in Latin:");
                String name2 = String.valueOf(scan.nextLine());
                birds.add(new Bird(name1, name2));
            }else if(command1.equals("Observation")){
                System.out.println("Bird?");
                String name1 = String.valueOf(scan.nextLine());
                if(isBird(name1, birds)){
                    for(Bird i : birds){
                        if(i.getName().equals(name1)){
                            i.addObservations();
                        }
                    }
                }else{
                    System.out.println("Not a bird!");
                }
            }else if(command1.equals("All")){
                for(Bird i : birds){
                    System.out.println(i);
                }
            }else if(command1.equals("One")){
                System.out.println("Bird?");
                String name1 = String.valueOf(scan.nextLine());
                for(Bird i : birds){
                    if(i.getName().equals(name1)){
                        System.out.println(i);
                    }
                }
            }
        }
        
    }

    public static boolean isBird(String bird, ArrayList<Bird> birds){
        for(Bird i : birds){
            if(i.getName().equals(bird)){
                return true;
            }
        }
        return false;
    }

}
