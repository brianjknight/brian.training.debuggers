package debugging;

public class Main {
	
    public static void main(String[] args) {
    	
        Statistics stats = new Statistics();

        stats.calculate();

        System.out.println("count: " + stats.getCount());
        System.out.println("sum: " + stats.getSum());
        System.out.println("average: " + stats.getAverage());
        System.out.println("min: " + stats.getMin());
        System.out.println("max: " + stats.getMax());
        
    }
    
}
