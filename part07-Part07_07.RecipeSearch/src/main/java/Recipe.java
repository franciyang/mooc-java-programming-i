import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private int time;
    private List<String> ingr;

    public Recipe(String name, int time, List<String> ingr){
        this.name = name;
        this.time = time;
        this.ingr = ingr;
    }

    public String getName(){
        return this.name;
    }

    public int getTime(){
        return this.time;
    }

    public List<String> getIngr(){
        return this.ingr;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTime(int time){
        this.time = time;
    }

    public void setIngr(ArrayList<String> ingr){
        this.ingr = ingr;
    }

    @Override
    public String toString(){
        return this.name + ", cooking time: " + this.time;
    }
}
