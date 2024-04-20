import java.util.ArrayList;

public class Stack {
    private ArrayList < String > stacks;

    public Stack() {
        this.stacks = new ArrayList < > ();
    }

    public boolean isEmpty() {
        if (this.stacks.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public void add(String value) {
        this.stacks.add(value);
    }
    public ArrayList < String > values() {
        return this.stacks;
    }

    public String take(){
        String place = this.stacks.get(this.stacks.size()-1);
        this.stacks.remove(this.stacks.size()-1);
        return place;
    }
}