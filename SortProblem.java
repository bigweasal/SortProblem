import java.util.*;
import java.io.*;
public class SortProblem
{
    static int quickCompare = 0;
    static int quickExchange = 0;
    public static void main (String [] args) throws IOException{
        System.out.println (" ========================= ");

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array3 = {1, 10, 4, 5, 2, 7, 8, 6, 9, 3};
        int[] array4 = new int[2000];
        int[] array5 = new int[2000];
        int[] array6 = new int[2000];

        Scanner inputFile;
        inputFile = new Scanner(new File("ordered.txt"));

        for (int i = 0; i< 2000; i++)
        {
            array4[i] = inputFile.nextInt();
        }
        inputFile = new Scanner(new File("reverse.txt"));
        for (int i = 0; i< 2000; i++)
        {
            array5[i] = inputFile.nextInt();
        }
        inputFile = new Scanner(new File("random2.txt")); //can switch random1 to random2 for different dataset
        for (int i = 0; i< 2000; i++)
        {
            array6[i] = inputFile.nextInt();
        }
        /*
        System.out.println ("Testing selection sort with 10 integers: ");
        System.out.println (" --- best case ---");
        selectionSort (array1);
        System.out.println (" --- worst case ---");
        selectionSort (array2);
        System.out.println (" --- average case ---");
        selectionSort (array3);
        System.out.println (" ========================= ");

        System.out.println ("Testing bubble sort with 10 integers: ");
        System.out.println (" --- best case ---");
        bubbleSort(array1);
        System.out.println (" --- worst case ---");
        bubbleSort(array2);
        System.out.println (" --- average case ---");
        bubbleSort(array3);
        System.out.println (" ========================= ");

        System.out.println ("Testing insertion sort with 10 integers: ");
        System.out.println (" --- best case ---");
        insertionSort (array1);
        System.out.println (" --- worst case ---");
        insertionSort (array2);
        System.out.println (" --- average case ---");
        insertionSort (array3);
        System.out.println (" ========================= ");
        SortProblem ob = new SortProblem();

        System.out.println ("Testing quick sort with 10 integers: ");
        System.out.println (" --- best case ---");
        quickSort(array1, 0, array1.length-1);
        System.out.println("Quick Sort: Number of Exchanges: " + quickExchange);
        System.out.println("Quick Sort: Number of Comparisons: " + quickCompare);
        quickExchange = 0;
        quickCompare = 0;
        System.out.println (" --- worst case ---");
        quickSort(array2, 0, array2.length-1);
        System.out.println("Quick Sort: Number of Exchanges: " + quickExchange);
        System.out.println("Quick Sort: Number of Comparisons: " + quickCompare);
        quickExchange = 0;
        quickCompare = 0;
        System.out.println (" --- average case ---");
        quickSort(array3, 0, array3.length-1);
        System.out.println("Quick Sort: Number of Exchanges: " + quickExchange);
        System.out.println("Quick Sort: Number of Comparisons: " + quickCompare);
        System.out.println (" ========================= ");

        System.out.println ("Testing Shell sort with 10 integers: ");
        System.out.println (" --- best case ---");
        ShellSort(array4, array4.length);
        System.out.println("Shell Sort: Number of Exchanges: " + quickExchange);
        System.out.println("Shell Sort: Number of Comparisons: " + quickCompare);
        quickExchange = 0;
        quickCompare = 0;
        System.out.println (" --- worst case ---");
        ShellSort(array5, array5.length);
        System.out.println("Shell Sort: Number of Exchanges: " + quickExchange);
        System.out.println("Shell Sort: Number of Comparisons: " + quickCompare);
        quickExchange = 0;
        quickCompare = 0;
        System.out.println (" --- average case ---");
        ShellSort(array6, array6.length);
        System.out.println("Shell Sort: Number of Exchanges: " + quickExchange);
        System.out.println("Shell Sort: Number of Comparisons: " + quickCompare);
        System.out.println (" ========================= ");

        System.out.println ("Testing Radix sort with 10 integers: ");
        System.out.println (" --- best case ---");
        radixSort(array1, array1.length);
        for (int i=0; i<array1.length; i++) 
        System.out.print(array1[i]+" "); 
        System.out.println("Radix Sort: Number of Exchanges: " + quickExchange);
        System.out.println("Radix Sort: Number of Comparisons: " + quickCompare);
        quickExchange = 0;
        quickCompare = 0;
        System.out.println (" --- worst case ---");
        radixSort(array2, array2.length);
        for (int i=0; i<array2.length; i++) 
        System.out.print(array2[i]+" ");
        System.out.println("Radix Sort: Number of Exchanges: " + quickExchange);
        System.out.println("Radix Sort: Number of Comparisons: " + quickCompare);
        quickExchange = 0;
        quickCompare = 0;
        System.out.println (" --- average case ---");
        radixSort(array3, array3.length);
        for (int i=0; i<array3.length; i++) 
        System.out.print(array3[i]+" "); 
        System.out.println("Radix Sort: Number of Exchanges: " + quickExchange);
        System.out.println("Radix Sort: Number of Comparisons: " + quickCompare);
        System.out.println (" ========================= ");
        quickExchange = 0;
        quickCompare = 0;

        System.out.println ("Testing Radix sort with 2000 integers: ");
        System.out.println (" --- best case ---");
        radixSort(array4, array4.length);
        System.out.println("Radix Sort: Number of Exchanges: " + quickExchange);
        System.out.println("Radix Sort: Number of Comparisons: " + quickCompare);
        quickExchange = 0;
        quickCompare = 0;
        System.out.println (" --- worst case ---");
        radixSort(array5, array5.length);
        System.out.println("Radix Sort: Number of Exchanges: " + quickExchange);
        System.out.println("Radix Sort: Number of Comparisons: " + quickCompare);
        quickExchange = 0;
        quickCompare = 0;
        System.out.println (" --- average case ---");
        radixSort(array6, array6.length);
        System.out.println("Radix Sort: Number of Exchanges: " + quickExchange);
        System.out.println("Radix Sort: Number of Comparisons: " + quickCompare);
        System.out.println (" ========================= ");*/

        System.out.println ("Testing heap sort with 10 integers: ");
        System.out.println (" --- best case ---");
        heapSort(array1);
        System.out.println (" --- worst case ---");
        heapSort(array2);
        System.out.println (" --- average case ---");
        heapSort(array3);
        System.out.println (" ========================= ");

        System.out.println ("Testing heap sort with 2000 integers: ");
        System.out.println (" --- best case ---");
        heapSort(array4);
        System.out.println (" --- worst case ---");
        heapSort(array5);
        System.out.println (" --- average case ---");
        heapSort(array6);
        System.out.println (" ========================= ");
    }

    public static void heapSort(int[] array)
    {
        int n = array.length;
        quickExchange=0;
        quickCompare=0;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);
        for (int i=n-1; i>=0; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
        System.out.println("Selection Sort: Number of Exchanges: " +
            quickExchange);
        System.out.println("Selection Sort: Number of Comparisons: " +
            quickCompare);
    }

    public static void heapify(int[] array, int n, int i)
    {
        int max = i;
        int left = 2*i + 1;
        int right = 2*i + 2;
        if (left < n && array[left] > array[max])
        {
            quickCompare++;
            max = left;
        }
        if (right < n && array[right] > array[max])
        {
            quickCompare++;
            max = right;
        }
        if (max != i)
        {
            int swap = array[i];
            array[i] = array[max];
            array[max] = swap;
            quickExchange++;
            heapify(array, n, max);
        }
    }

    public static void radixSort(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        for (int exp = 1; mx/exp > 0; exp *= 10) 
            countSort(arr, n, exp); 
    }

    public static void countSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n];
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
        for (i = 0; i < n; i++) 
        {
            count[ (arr[i]/exp)%10 ]++; 
            quickCompare++;
        }
        for (i = 1; i < 10; i++) 
        {
            count[i] += count[i - 1];
            quickExchange++;
        }
        for (i = n - 1; i >= 0; i--) 
        { 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        } 
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 

    public static void quickSort(int array[], int low, int high) {
        int pivotPoint = partition(array, low, high);
        //System.out.println("pivotPoint = " +pivotPoint);
        if(low < pivotPoint)
            quickSort(array, low, pivotPoint-1);
        if(pivotPoint < high)
            quickSort(array, pivotPoint+1, high);
    }

    public static int partition(int array[], int low, int high)
    {
        int pivot = array[low];
        while(low < high)
        {
            while(pivot < array[high] && low <high)
            {
                high = high-1;
                quickCompare++;
            }
            if( high != low)
            {
                array[low]= array[high];
                low = low + 1;
                quickExchange++;
                quickCompare++;
            }
            while(array[low] < pivot && low < high)
            {
                low = low +1;
                quickCompare++;
            }
            if( high != low)
            {
                array[high] = array[low];
                high = high -1;
                quickExchange++;
                quickCompare++;
            }
        }
        array[high] = pivot;
        return high;
        //pivotPoint = high;
    }

    public static void selectionSort(int[] array) {
        int temp, min, exchanges = 0, comparisons = 0;
        int numberOfItems = array.length;

        for (int pass=0; pass != numberOfItems - 1; pass++)    { 
            min = pass;
            for (int index = pass+1; index != numberOfItems; index++) { 
                comparisons++;
                if (array[index] < array[min])
                    min = index;
            } // end inner loop
            temp = array[min];
            array[min] = array[pass];
            array[pass] = temp;
            exchanges++;
        } // end outer loop
        System.out.println("Selection Sort: Number of Exchanges: " + exchanges);
        System.out.println("Selection Sort: Number of Comparisons: " + comparisons);
    }

    public static void bubbleSort(int[] array) {
        int comparisons = 0, exchanges =0, temp;
        int n = array.length;
        boolean cont = true;
        for(int pass=1; pass!=n;pass++)
        {
            if(cont)
            {
                for(int i = 0; i!=n-pass;i++)
                {
                    if(array[i]>array[i+1]
                    )
                    {
                        comparisons++;
                        temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                        cont = true;
                        exchanges++;
                    }
                }
            }
            else
                break;
        }
        System.out.println("Selection Sort: Number of Exchanges: " +
            exchanges);
        System.out.println("Selection Sort: Number of Comparisons: " +
            comparisons);
    }

    public static void insertionSort(int[] array) {
        int exchanges = 0, comparisons = 0;
        int n = array.length;
        for (int j=1;j<n;j++)
        {
            int key = array[j];
            int i =j-1;
            while(
            (i>-1) && (array[i] >key)
            )
            {
                array[i+1]=array[i];
                i--;
                exchanges++;
                comparisons++;
            }
            array[i+1]=key;
        }
        System.out.println("Selection Sort: Number of Exchanges: " +
            exchanges);
        System.out.println("Selection Sort: Number of Comparisons: " +
            comparisons);
    }
}