
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] arrOfStr = input.split(" ");
            String command = arrOfStr[0];
            int value = Integer.valueOf(arrOfStr[1]);
            if(value > 0){
                if(command.equals("add")){
                    if(first + value <= 100){
                        first += value;
                    }else if(first + value > 100){
                        first = 100;
                    }
                }else if(command.equals("move")){
                    if(value > first && first > 0){
                        second = first;
                        first = 0;
                    }else if(value <= first && first > 0){
                        if(second + value <= 100){
                            if(value >= first){
                                first = 0;
                            }else{
                                first -= value;
                            }
                            second += value;
                        }else if(second + value > 100){
                            if(value >= first){
                                first = 0;
                            }else{
                                first -= value;
                            }
                            second = 100;
                        }
                    }
                }else if(command.equals("remove")){
                    if(second > 0){
                        if(second - value >= 0){
                            second -= value;
                        }
                    }
                }
            }
            



        }
    }

}
