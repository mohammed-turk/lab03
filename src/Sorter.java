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
    public static void main(String[] args) {
        
    }
    
}
