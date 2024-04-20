
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
       this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if(payment >= 2.50){
            double change = payment - 2.50;
            this.money = this.money + 2.50;
            this.affordableMeals++;
            return change;
        } else{
            return payment;
        }

    }

    public double eatHeartily(double payment) {
        if(payment >= 4.30){
            double change = payment - 4.30;
            this.money = this.money + 4.30;
            this.heartyMeals++;
            return change;
        } else{
            return payment;
        }
    }
    
    public boolean eatAffordably(PaymentCard card){
        if(card.balance() >= 2.50){
            card.takeMoney(2.50);
            this.affordableMeals++;
            return true;
        } else{
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card){
        if(card.balance() >= 4.30){
            card.takeMoney(4.30);
            this.heartyMeals++;
            return true;
        } else{
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum >= 0){
            card.addMoney(sum);
            this.money = this.money + sum;
        }
    }
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
