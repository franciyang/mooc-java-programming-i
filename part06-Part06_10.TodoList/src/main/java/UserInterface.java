import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.println("Command:");
            String commandInput = String.valueOf(scanner.nextLine());
            if(commandInput.contains("stop")){
                break;
            }else if(commandInput.contains("add")){
                System.out.println("To add:");
                String addInput = String.valueOf(scanner.nextLine());
                this.list.add(addInput);
            }else if(commandInput.contains("list")){
                this.list.print();
            }else if(commandInput.contains("remove")){
                System.out.println("Which one is removed?");
                String removeInput = String.valueOf(scanner.nextLine());
                int number = Integer.valueOf(removeInput);
                this.list.remove(number);
            }
        }
    }
}
