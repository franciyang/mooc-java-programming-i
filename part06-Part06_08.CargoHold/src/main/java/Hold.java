import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> hold;
    
    public Hold(int weight){
        this.maxWeight = weight;
        this.hold = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        int weightSum = 0;
        for(Suitcase a : this.hold){
            weightSum += a.totalWeight();
        }
        if(weightSum + suitcase.totalWeight() <= maxWeight){
            hold.add(suitcase);
        }
    }

    public String toString(){
        int weightSum = 0;
        for(Suitcase a : this.hold){
            weightSum += a.totalWeight();
            if(this.hold.size() == 1){
                return this.hold.size() + " suitcase (" + weightSum + " kg)";
            }
        }
        return this.hold.size() + " suitcases (" + weightSum + " kg)";
    }

    public void printItems(){
        for(Suitcase a : this.hold){
            a.printItems();
        }
    }
}
