import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = String.valueOf(scanner.nextLine());
            if(command.contains("X")){
                break;
            }else if(command.contains("1")){
                System.out.println("Write the joke to be added:");
                String addInput = String.valueOf(scanner.nextLine());
                this.manager.addJoke(addInput);
            }else if(command.contains("2")){
                System.out.println(this.manager.drawJoke());
            }else if(command.contains("3")){
                this.manager.printJokes();
            }
        }
    }
}
