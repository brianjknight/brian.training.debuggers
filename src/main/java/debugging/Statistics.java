package debugging;

public class Statistics {

    private int count;
    private int sum;
    private double average;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public void calculate() {
        for (int i=1; i<=1000; i++) {
            count += 1;
            sum += i;
            average = sum/(double) count;
            if (i < min) min = i;
            if (i > max) max = i; 
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

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

}
