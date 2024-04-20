
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int count = 0;
        while (count < array.length - 1){
            System.out.print(array[count] + ", ");
            count++;
        }

        System.out.print(array[array.length - 1]);
    }
}
