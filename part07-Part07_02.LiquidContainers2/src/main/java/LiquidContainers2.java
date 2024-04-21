
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true){
            System.out.println("First:" + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] arrOfStr = input.split(" ");
            String command = arrOfStr[0];
            int value = Integer.valueOf(arrOfStr[1]);
            if(command.equals("add")){
                first.add(value);
            }else if(command.equals("move")){
                if(value > first.contains()){
                    second.add(first.contains());
                    first.remove(value);
                }else{
                    first.remove(value);
                    second.add(value);
                }
            }else if(command.equals("remove")){
                second.remove(value);
            }
        }
    }

}
