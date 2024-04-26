public class Bird {
    private String name;
    private String nameLatin;
    private int observations;

    public Bird(String name, String nameLatin){
        this.name = name;
        this.nameLatin = nameLatin;
        this.observations = 0;
    }

    public void addObservations(){
        this.observations++;
    }

    public String getName(){
        return this.name;
    }

    public String getNameLatin(){
        return this.nameLatin;
    }

    public int getObservations(){
        return this.observations;
    }

    @Override
    public String toString(){
        if(this.observations == 1){
            return this.name + " (" + this.nameLatin + ") " + this.observations + " observation";
        }else{
            return this.name + " (" + this.nameLatin + ") " + this.observations + " observations";
        }
    }
}
