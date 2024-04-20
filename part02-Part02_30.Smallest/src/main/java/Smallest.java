
public class Smallest {

    public static int smallest(int number1, int number2) {
        int correct = 0;
        if(number1 < number2){
            correct = number1;
        } else if(number2 < number1){
            correct = number2;
        }
        return correct;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
