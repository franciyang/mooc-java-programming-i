public class Fitbyte {
    private int age;
    private int rest;

    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.rest = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum){
        double max = 206.3 - (0.711 * age);
        double newRest = 1.0 * rest;
        return ((max - newRest) * (percentageOfMaximum) + newRest);
    }

}
