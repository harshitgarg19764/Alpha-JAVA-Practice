public class Sort {
    public void bubbleSort(int num[]){
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-1-i;j++){
                if(num[j+1]<num[j]){
                    int temp = num[j+1];
                    num[j+1]=num[j];
                    num[j]=temp;
                }
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }
    public void bubbleSortDec(int num[]){
        for(int i=0;i<num.length-1;i++){
            for(int j=num.length-1-i;j>0;j--){
                if(num[j-1]<num[j]){
                    int temp = num[j-1];
                    num[j-1]=num[j];
                    num[j]=temp;
                }
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }

}
