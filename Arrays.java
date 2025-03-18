import java.util.*;
public class Arrays {
    public int largestNum(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i< num.length;i++){
            if(largest<num[i]){
                largest =num[i];
            }
            if(smallest>num[i]){
                smallest=num[i];
            }


        }
        System.out.println(largest);
        System.out.println(smallest);
        return 0;
    }

    public int binarySearch(int num[],int key){
        int start=0;
        int end = num.length -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(key<num[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public void reverseArray(int num[]){
        int start =0;
        int end = num.length-1;
        while(start<end){
            int temp=num[end];
            num[end] = num[start];
            num[start]= temp;

            start++;
            end--;
        }
    }

    public void pairsArray(int num[]){
        int start=1;
        for(int i=0;i<num.length;i++){
            for(int j=start;j<num.length;j++){
                System.out.print("(");
                System.out.print((num[i] + ","));
                System.out.print(num[j]);
                System.out.print(")");
            }
            start++;

            System.out.println();
        }
    }

    public void subArrays(int num[]){
        int ts =0;
        for(int i=0;i<num.length;i++){
            int start= i;
            for(int j =i;j<num.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]);
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println(ts);
    }
    public void sumSubArrays(int num[]){
        int ts =0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            int start= i;
            for(int j =i;j<num.length;j++){
                int end = j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]);
                    sum = sum + num[k];
                }
                if(sum>largest){
                    largest = sum;
                }
                if(sum<smallest){
                    smallest =sum;
                }
                
                System.out.println();
                System.out.println("sum of sub array :" + sum);
                ts++;
            }
            System.out.println();
        }
        System.out.println("largest : "+ largest);
        System.out.println("smallest : "+ smallest);
        System.out.println("total subarraym : "+ts);
    }

    public void prefixArr(int num[]){
        int subarr = 0;
        int prefix[] = new int[num.length];
        int max = Integer.MIN_VALUE;
        prefix[0]=num[0];
        for (int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++){
            int start =i;
            for(int j=i;j<num.length;j++){
                int end =j;
                
                subarr = start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(subarr>max){
                    max = subarr;
                }
            }
            
        }
        System.out.println(max);

    }

    public void kadanes(int num[]){
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        currSum=0;

        for(int i=0;i<num.length;i++){
            currSum = currSum +num[i];

            if(currSum<0){
                currSum=0;
            }
            max = Math.max(currSum,max);
        }
        System.out.println(max);
    }


    public void rainWater(int num[]){
        int waterlevel=0;
        int totwater = 0;
        int lmax [] = new int[num.length];
        lmax[0] = num[0];
        for(int i=1;i<num.length;i++){
            lmax[i] = Math.max(num[i], lmax[i-1]);
        }
        int rmax[] = new int[num.length];
        rmax[num.length-1] = num[num.length-1];
        for(int i=num.length-2;i>=0;i--){
            rmax[i] = Math.max(num[i],rmax[i+1] );
        }
        for(int i=0;i<num.length;i++){
            waterlevel = Math.min(lmax[i], rmax[i]);
            totwater  = totwater+ waterlevel - num[i] ;
        }
        System.out.print(totwater);  
    }

    public void buySellStock(int num[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit =0;
        for(int i=0;i<num.length;i++){
            if(buyprice<num[i]){
                int profit = num[i]-buyprice;
                maxprofit = Math.max(profit, maxprofit);
            }
            else{
                buyprice =num[i];
            }

        }
        System.out.println(maxprofit);


    }

    public boolean q1(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
                return false;
    }



            }


