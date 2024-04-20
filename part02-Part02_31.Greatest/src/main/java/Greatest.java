
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int correct = 0;
        if(number1 > number2){
            if(number1 > number3){
                correct = number1;
            }else if(number3 > number1){
                correct = number3;
            }else{
                correct = number1;
            }
        } else if(number2 > number1){
            if(number2 > number3){
                correct = number2;
            }else if(number3 > number2){
                correct = number3;
            }else{
                correct = number1;
            }
        }else{
            correct =  number1;
        }

        return correct;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
