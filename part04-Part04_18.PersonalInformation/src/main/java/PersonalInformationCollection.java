
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String fname = String.valueOf(scanner.nextLine());
            if(fname.isEmpty()){
                break;
            }
            String lname = String.valueOf(scanner.nextLine());
            String idNumber = String.valueOf(scanner.nextLine());
            infoCollection.add(new PersonalInformation(fname, lname, idNumber));

        }

        System.out.println("");
        for(PersonalInformation count: infoCollection){
            System.out.println(count.getFirstName() + " " + count.getLastName());
        }

    }
}
