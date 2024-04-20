import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcase;
    private int maxWeight;

    public Suitcase(int weight){
        this.suitcase = new ArrayList<>();
        this.maxWeight = weight;
    }

    public void addItem(Item item){
        int weightSum = 0;
        for(Item a : this.suitcase){
            weightSum += a.getWeight();
        }
        if(weightSum + item.getWeight() <= maxWeight){
            suitcase.add(item);
        }
    }

    public String toString(){
        int weightSum = 0;
        if(this.suitcase.isEmpty()){
            return "no items (" + weightSum + " kg)";
        }

        for(Item a : this.suitcase){
            weightSum += a.getWeight();
            if(this.suitcase.size() == 1){
                return this.suitcase.size() + "item (" + a.getWeight() + " kg)";
            }
        }
        return this.suitcase.size() + "items (" + weightSum + " kg)";
    }

    public void printItems(){
        for(Item a : this.suitcase){
            System.out.println(a.getName() + " (" + a.getWeight() + "kg)");
        }
    }

    public int totalWeight(){
        int weightSum = 0;
        for(Item a : this.suitcase){
            weightSum += a.getWeight();
        }
        return weightSum;
    }

    public Item heaviestItem(){
        if(this.suitcase.isEmpty()){
            return null;
        }
        int index = 0;
        int indexCount = 0;
        Item measure = this.suitcase.get(0);
        for(Item a : this.suitcase){
            if(a.getWeight() > measure.getWeight()){
                index = indexCount;
                measure = a;
            }
            indexCount++;
        }
        return this.suitcase.get(index);
    }

}
