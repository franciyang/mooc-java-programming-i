
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int count = 0;
        while(count < array.length){
            int incount = 0;
            while(incount < array[count]){
                System.out.print("*");
                incount++;
            }
            System.out.println("");
            count++;
        
        }
    }

}
