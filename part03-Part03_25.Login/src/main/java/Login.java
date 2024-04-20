
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String userinput = String.valueOf(scanner.nextLine());
        System.out.println("Enter password:");
        String passinput = String.valueOf(scanner.nextLine());
        if(userinput.equals("alex")){
            if(passinput.equals("sunshine")){
                System.out.println("You have successfully logged in!");
            }else{
                System.out.println("Incorrect username or password!");
            }
        }else if(userinput.equals("emma")){
            if(passinput.equals("haskell")){
                System.out.println("You have successfully logged in!");
            }else{
                System.out.println("Incorrect username or password!");
            }
        }else{
            System.out.println("Incorrect username or password!");
        }
    }
}
