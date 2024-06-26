import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Title:");
            String title = String.valueOf(scanner.nextLine());
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, pages, year));
        }

        System.out.println("What information will be printed?");
        String answer = String.valueOf(scanner.nextLine());
        for(Book count : books){
            if(answer.equals("everything")){
                System.out.println(count.toString());
            }else if(answer.equals("name")){
                System.out.println(count.getTitle());
            }
        }
    }
}
