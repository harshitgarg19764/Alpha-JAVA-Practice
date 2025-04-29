public class Sort {
    public void bubbleSort(int num[]){
        boolean swapp;
        int count=0;
        for(int turn=0;turn<num.length-1;turn++){
            swapp = true;
            for(int j=0;j<num.length-turn-1;j++){
                if(num[j]>num[j+1]) {
                    int temp=num[j+1];
                    num[j+1]=num[j];
                    num[j]=temp;
                    swapp = false;
                    count++;
                }
            }
            if(swapp){
                break;
            }
            System.out.println(count);
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }
}
