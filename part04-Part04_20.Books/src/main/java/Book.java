public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String name, int pages, int year){
        this.title = name;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public String toString(){
        return title + ", " + pages + " pages, " + year;
    }
}
