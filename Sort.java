public class Sort {
    static void insertion(int [] array) {
        for(int i=1; i<array.length; i++) {
            int key = array[i];
            int j = i-1;

            while(j>=0 && array[j]>key) {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] =  key;
        }
    }

    static void selection(int [] array) {
        for(int i=0; i< array.length-1; i++) {
            int min = i;
            for(int j=i; j< array.length; j++) {
                if(array[j]<array[min])
                    min = j;
            }
            int temp = array[min];
            array[min] = array[i];
            array[i]=temp;
        }
    }

    static void shel(int[] array) {
        for(int gap= array.length/2; gap< array.length; gap++) {

        }
    }
}