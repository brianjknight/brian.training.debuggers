package debugging;

public class Main {
	
    public static void main(String[] args) {
    	
        Counter counter = new Counter();

        counter.count();

        System.out.println("count: " + counter.getCount());
        System.out.println("sum: " + counter.getSum());
        System.out.println("average: " + counter.getAverage());
        
    }
    
}
