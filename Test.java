import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] prices = ArrayGenerator.generate(10);
        Sort.merge(prices);
        p.n(Arrays.toString(prices));
    }    
}