
public class HealthStation {
    private int count;

    public HealthStation(){
        this.count = 0;
    }

    public int weigh(Person person) {
        count++;
        return person.getWeight();
    }

    public void feed(Person person){
        int increase = 1;
        
        person.setWeight(person.getWeight() + increase);
    }

    public int weighings(){
        return count;
    }

}
