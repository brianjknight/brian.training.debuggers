package debugging;

public class Statistics {

    private int count;
    private int sum;
    private double average;
    private Long min = Long.MAX_VALUE;
    private Integer max = Integer.MIN_VALUE;
    
    public void calculate() {
    	for (int i=1; i<=1000; i++) {
            count += 1;
            sum += i;
            average = sum/(double) count;
            if (i < min) min = (long) i;
            if (i > max) max = i; 
        }
    }

    public int getCount() { return count; }

    public int getSum() { return sum; }

    public double getAverage() { return average; }

	public Long getMin() { return min; }

	public Integer getMax() { return max; }
	
	public String getStats() {
		return "[" + count + "," + sum + "," + average + "," + min + "," + max + "]";
	}

	public String toString() {
		return "Statistics [count=" + count + 
				", sum=" + sum + 
				", average=" + average + 
				", min=" + min + 
				", max=" + max + "]";
	}
	
}
