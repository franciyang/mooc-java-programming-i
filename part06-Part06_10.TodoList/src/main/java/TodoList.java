import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<>();
    }

    public void add (String task){
        this.list.add(task);
    }

    public void print(){
        int count = 1;
        for(String a : list){
            System.out.println(count + ": " + a);
            count++;
        }
    }

    public void remove(int number){
        this.list.remove(number -1);
    }
}
