
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = String.valueOf(scanner.nextLine());
            if(identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = String.valueOf(scanner.nextLine());
            if(name.isEmpty()){
                break;
            }
            Archive archived = new Archive(identifier, name);
            if((archive.contains(archived))){
            }else{
                archive.add(archived);
            }
        }
        System.out.println("");
        System.out.println("==Items==");
        for(int i = 0; i < archive.size(); i++){
            System.out.println(archive.get(i));
        }

    }
}
