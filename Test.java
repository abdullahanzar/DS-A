import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] prices = ArrayGenerator.generate(10);
        Sort.insertion(prices);
        p.n(Arrays.toString(prices));
    }    
}