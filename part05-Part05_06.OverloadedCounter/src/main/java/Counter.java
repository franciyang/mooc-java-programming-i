public class Counter {
    private int count;

    public Counter(int startValue){
        this.count = startValue;
    }

    public Counter(){
        this.count = 0;
    }

    public int value(){
        return count;
    }

    public void increase(){
        this.count = count + 1;
    }

    public void decrease(){
        this.count = count - 1;
    }

    public void increase(int increaseBy){
        if(increaseBy >= 0){
            this.count = count + increaseBy;
        }
    }

    public void decrease(int decreaseBy){
        if(decreaseBy >= 0){
            this.count = count - decreaseBy;
        }
    }
}
