import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class ArrayGenerator {
    static int[] generate(int size) {
        Set<Integer> unique = new HashSet<>();
        int array[] = new int[size];
        Random random = new Random();
        for(int i=0; i<size; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(size*2);
            }
            while(!unique.add(randomNumber));
            array[i] = randomNumber;
        }
        return array;
    }
    
}
