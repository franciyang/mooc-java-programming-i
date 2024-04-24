
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                pointAverages(list);
                passingAverages(list);
                gradeDistribution(list);
                break;
            }else if(input >= 0 && input <= 100){
                list.add(input);
            }
        }

    }

    public static void pointAverages(ArrayList<Integer> list){
        int sum = 0;
                for(int i : list){
                    sum += i;
                }
                double average = 1.0 * sum / list.size();
                System.out.println("Point average (all): " + average);
    }

    public static void passingAverages(ArrayList<Integer> list){
        int sum = 0;
        int passCount = 0;
        if(list.isEmpty()){
            System.out.println("Point average (passing): -");
        }else{
            for(int i : list){
                if(i >= 50){
                    sum += i;
                    passCount++;
                }
            }
            double average = 1.0 * sum / passCount;
            System.out.println("Passing average (passing): " + average);
            if(passCount > 0){
                double percentage = 100.0 * passCount / list.size();
                System.out.println("Pass percentage: " + percentage);
            }else{
                System.out.println("Pass percentage: " + 0.0);
            }
        }
    }

    public static void gradeDistribution(ArrayList<Integer> list){
        ArrayList<Integer> grades = new ArrayList<>();
        int fail = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        for(int i : list){
            if(i >= 0 && i <= 100){
                if(i < 50){
                    fail++;
                }else if(i < 60){
                    one++;
                }else if (i < 70){
                    two++;
                }else if(i < 80){
                    three++;
                }else if(i < 90){
                    four++;
                }else{
                    five++;
                }
            }
        }
        System.out.print("5: ");
        while(five > 0){
            System.out.print("*");
            five--;
        }
        System.out.println();
        System.out.print("4: ");
        while(four > 0){
            System.out.print("*");
            four--;
        }
        System.out.println();
        System.out.print("3: ");
        while(three > 0){
            System.out.print("*");
            three--;
        }
        System.out.println();
        System.out.print("2: ");
        while(two > 0){
            System.out.print("*");
            two--;
        }
        System.out.println();
        System.out.print("1: ");
        while(one > 0){
            System.out.print("*");
            one--;
        }
        System.out.println();
        System.out.print("0: ");
        while(fail > 0){
            System.out.print("*");
            fail--;
        }
    }
}
