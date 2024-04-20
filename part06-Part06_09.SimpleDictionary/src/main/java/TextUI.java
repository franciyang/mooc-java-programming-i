import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scan, SimpleDictionary dictionary){
        this.scanner = scan;
        this.dictionary = dictionary;
    }

    public void start(){
        while(true){
            System.out.println("Command:");
            String input = String.valueOf(scanner.nextLine());
            if(input.contains("end")){
                System.out.println("Bye bye!");
                break;
            } else if(input.contains("add")){
                System.out.println("Word:");
                String wordInput = String.valueOf(scanner.nextLine());
                System.out.println("Translation:");
                String translationInput = String.valueOf(scanner.nextLine());
                this.dictionary.add(wordInput, translationInput);
            } else if(input.contains("search")){
                System.out.println("To be translated:");
                String translateInput = String.valueOf(scanner.nextLine());
                if(this.dictionary.translate(translateInput) == null){
                    System.out.println("Word " + translateInput + " was not found");
                }else{
                    System.out.println("Translation: " + this.dictionary.translate(translateInput));
                }
            }
            else{
                System.out.println("Unknown command");
            }
        }
    }
}
