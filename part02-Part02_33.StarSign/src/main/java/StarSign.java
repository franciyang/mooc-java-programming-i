
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int count = 0;
        while(count < number){
            System.out.print("*");
            count++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int count = 0;
        while(count < size){
            printStars(size);
            count++;
        }
        
    }

    public static void printRectangle(int width, int height) {
        int column = 0;
        int row = 0;
        while(row < height){
            column = 0;
            while(column < width){
                System.out.print("*");
                column++;
            }
            System.out.println("");
            row++;
        }
    }

    public static void printTriangle(int size) {
        int row = 1;
        int count = 0;
        while(row <= size){
            while(count < row){
                System.out.print("*");
                count++;
            }
            System.out.println("");
            count = 0;
            row++;
        }
    }
}
