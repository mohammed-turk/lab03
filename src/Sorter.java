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
        int[] z= {1,7,3,9};
        int[] x= sort(z);
        System.out.println(Arrays.toString(x));
        
        
    }
    
}
