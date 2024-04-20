import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room(){
        this.persons = new ArrayList<>();
    }

    public void add(Person person){
        this.persons.add(person);
    }

    public boolean isEmpty(){
        if(this.persons.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Person> getPersons(){
        return this.persons;
    }

    public Person shortest(){
        if(this.persons.isEmpty()){
            return null;
        }
        int returnHeight = this.persons.get(0).getHeight();
        Person returnPerson = this.persons.get(0);
        for(Person a : this.persons){
            if(returnHeight > a.getHeight()){
                returnHeight = a.getHeight();
                returnPerson = a;
            }
        }
        return returnPerson;
    }

    public Person take(){
        if(this.persons.isEmpty()){
            return null;
        }
        int returnHeight = this.persons.get(0).getHeight();
        Person returnPerson = this.persons.get(0);
        for(Person a : this.persons){
            if(returnHeight > a.getHeight()){
                returnHeight = a.getHeight();
                returnPerson = a;
            }
        }
        this.persons.remove(returnPerson);
        return returnPerson;
    }
}
