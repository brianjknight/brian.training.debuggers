package debugging;

public class Counter {

    private int count;
    private int sum;
    private double average;

    public void count() {
        for (int i=1; i<=1000; i++) {
            count += 1;
            sum += i;
            average = sum/(double) count;
        }
    }

    public int getCount() {
        return count;
    }

    public int getSum() {
        return sum;
    }

    public double getAverage() {
        return average;
    }

}
