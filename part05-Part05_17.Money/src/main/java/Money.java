
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition){
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared){
        if(this.euros < compared.euros){
            return true;
        }else if(this.euros == compared.euros){
            if(this.cents < compared.cents){
                return true;
            }
        }
        if(!(compared instanceof Money)){
            return false;
        }

        return false;

    }

    public Money minus(Money decreaser){
        int euroDiff = this.euros - decreaser.euros;
        int centsDiff = this.cents - decreaser.cents;
        int totalDiff = euroDiff * 100 + centsDiff;

        if(totalDiff <= 0){
            return new Money(0,0);
        }else{
            int eurosRtn = totalDiff / 100;
            int centsRtn = totalDiff % 100;
            return new Money(eurosRtn, centsRtn);
        }
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
