import java.util.ArrayList;

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

    static void shell(int[] array) {
        for(int gap= array.length/2; gap>0; gap=gap/2) {
            for(int i=gap; i<array.length; i++) {
                int key = array[i];
                int j;
                for(j=i; j>=gap && array[j-gap]>key; j-=gap) {
                    array[j] = array[j-gap];
                }
                array[j] = key;
            }
        }
    }

    public static void merge(int[] array) {
         mergeSort(array, 0, array.length-1);
    }

    private static void mergeSort(int array[], int low, int high) {
        if(low>=high)
            return;
        int mid = (low + high) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);
        merge(array, low, mid, high);
    }

    private static void merge(int array[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high) {
            if(array[left]<array[right]) {
                temp.add(array[left]);
                left++;
            }
            else {
                temp.add(array[right]);
                right++;
            }
        }
        while(left<=mid) {
            temp.add(array[left]);
            left++;
        }
        while(right<=high) {
            temp.add(array[right]);
            right++;
        }
        for(int i=low; i<=high; i++) {
            array[i] = temp.get(i-low);
        }
    }
}