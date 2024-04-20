public class MainProgram {
    public static void main(String[] args) {
        PaymentCard Paul = new PaymentCard(20);
        PaymentCard Matt = new PaymentCard(30);
        Paul.eatHeartily();
        Matt.eatAffordably();
        System.out.println("Paul: " + Paul.toString());
        System.out.println("Matt: " + Matt.toString());
        Paul.addMoney(20);
        Matt.eatHeartily();
        System.out.println("Paul: " + Paul.toString());
        System.out.println("Matt: " + Matt.toString());
        Paul.eatAffordably();
        Paul.eatAffordably();
        Matt.addMoney(50);
        System.out.println("Paul: " + Paul.toString());
        System.out.println("Matt: " + Matt.toString());
    }
}