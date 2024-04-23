
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i : array){
            if(i < smallest){
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int index = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int[] copy = table;
        int index = startIndex;
        int track = index;
        int smallest = copy[index];
        while(index < copy.length){
            if(copy[index] < smallest){
                smallest = copy[index];
                track = index;
                index++;
            }else{
                index++;
            }
        }
        return track;
    }

    public static void swap(int[] array, int index1, int index2){
        int first = index1;
        int second = index2;
        int hold = array[first];
        array[first] = array[second];
        array[second] = hold;
    }

    public static void sort(int[] array){
        int[] copy = array;
        for(int i = 0 ; i < array.length ; i++){
            System.out.println(array);
            int index = MainProgram.indexOfSmallestFrom(copy, i);
            MainProgram.swap(copy,i,index);
        }
    }
}
