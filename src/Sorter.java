import java.util.Arrays;

public class Sorter {
    public static void SelactionSort(int[] list){
        for (int i=0;i<list.length-1;i++){
            int curreentMin=list[i];
            int currentMinIndex= i;
            for(int j=i+1;j<list.length;j++){
                if (curreentMin>list[j]) {
                    curreentMin = list[j];
                    currentMinIndex=j;
                }
            }
            if(curreentMin!= i){
                list[currentMinIndex]=list[i];
                list[i]=curreentMin;
            }
        }

    }
    public static int[] sort(int[] list){
        SelactionSort(list);
        return list;
    }    
        

    public static void main(String[] args) {
        int[] x={1,7,5};
        sort(x);
        System.out.println(Arrays.toString(x));
        
    }
    
}

class InsertionSort {
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
 
    /* A utility function to print array of size n*/
     void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
}
