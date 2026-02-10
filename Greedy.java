import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Greedy {
    public void activitySelection(int start[],int end[]){
            int maxActivities = 0;
            ArrayList<Integer> idx = new ArrayList<>();

            idx.add(0);
            maxActivities=1;

            int previousActivity = 0;

            for(int i=1;i<start.length;i++){
                if(start[i]>=end[previousActivity]){
                    idx.add(i);
                    maxActivities++;
                    previousActivity=i;
                }
            }

            System.out.println("Max Activities : "  + maxActivities);
            for(int i=0;i<idx.size();i++){
                System.out.println("A" + idx.get(i));
            }
    } 

    public void fractionalKnapsack(int weight[],int value[],int w){
        double ratio[][] = new double[weight.length][2];
        for(int i=0;i<ratio.length;i++){
            ratio[i][0] = i;  
            ratio[i][1] = value[i]/(double)weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        double finalVal =0;
        for (int i = ratio.length-1; i >=0; i--) {
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                capacity -= weight[idx];
                finalVal += value[idx];
            }
            else{
                finalVal += ratio[i][1]*capacity;
                capacity = 0;
                break;
            }

        }
        System.out.println((int)finalVal);
        
    }

    public void minAbsoluteDifference(int a[],int b[]){
        Arrays.sort(a);
        Arrays.sort(b);
        int diff = 0;
        for(int i=0;i<a.length;i++){
            diff += Math.abs(a[i]-b[i]);
        }

        System.out.println(diff);
    }

    public void maxChainPairs(int arr[][]){
            Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
            int chainLen = 1;
            int chainEnd = arr[0][1];

            for(int i=1;i<arr.length;i++){
                if(arr[i][0]>chainEnd){
                    chainLen++;
                    chainEnd=arr[i][1];
                }
            }
            System.out.println(chainLen);
    }

    public void IndianCoins(int coins[],int value){
        ArrayList<Integer> list = new ArrayList<>();
        int minCoins = 0;
        //coins value in descending order
        for(int i=coins.length-1;i>=0;i--){
            while(value>=coins[i]){
                value -= coins[i];
                minCoins++;
                list.add(coins[i]);
            }
        }

        System.out.println(minCoins);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }  
    
    public void chocola(Integer costVer[],Integer costHor[]){
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());
        int cost=0;
        int horCut =1;
        int verCut =1;
        int h=0;
        int v=0;

        while(h<costHor.length && v<costVer.length){
            if(costHor[h]>costVer[v]){
                cost += costHor[h]*verCut;
                horCut++;
                h++;
            }
            else{
                cost+= costVer[v]*horCut;
                verCut++;
                v++;
            }
        }
        while(v<costVer.length){
            cost+= costVer[v]*horCut;
            verCut++;
            v++;
        }
        while(h<costHor.length){
            cost += costHor[h]*verCut;
            horCut++;
            h++;
        }

        System.out.println(cost);

    }
    public void jobSequencing(int jobInfo[][]){

    }


    public void balancedStringPartitions(String str){
        int balance=0;
        int ans=0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='l'){
                balance++;
                
            }
            else{
                balance--;
            }
            if(balance==0){
                ans++;
            }
        }
        System.out.println(ans);

    }
}
