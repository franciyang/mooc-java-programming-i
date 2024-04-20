public class Timer {
    private ClockHand seconds;
    private ClockHand hundredths;

    public Timer() {

        this.seconds = new ClockHand(60);
        this.hundredths = new ClockHand(100);

    }

    public String toString() {
        return seconds + ":" + hundredths;
    }

    public void advance() {
        hundredths.advance();

        if (hundredths.value() == 0) {
            seconds.advance();
        }
    }
}