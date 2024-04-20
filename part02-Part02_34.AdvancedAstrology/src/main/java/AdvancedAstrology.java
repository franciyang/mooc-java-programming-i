
public class AdvancedAstrology {

    public static void printStars(int number) {
        int count = 0;
        while(count < number){
            System.out.print("*");
            count++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int count = 0;
        while(count < number){
            System.out.print(" ");
            count++;
        }
        
    }

    public static void printTriangle(int size) {
        int number = size - 1;
        int number2 = size - number;
        while(number >= 0){
            int spaces = 0;
            int stars = 0;
            while(spaces < number){
                System.out.print(" ");
                spaces++;
            }
            while(stars < number2){
                System.out.print("*");
                stars++;
            }
            System.out.println("");
            number = number - 1;
            number2 = size - number;
        }
    }

    public static void christmasTree(int height) {
        int number = height - 1;
        int number2 = 1;
        while(number >= 0){
            printSpaces(number);
            printStars(number2);
            number = number - 1;
            number2 = number2 + 2;
        }
        number = height - 2;
        printSpaces(number);
        printStars(3);
        printSpaces(number);
        printStars(3);

        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
