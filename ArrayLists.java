import java.util.*;
public class ArrayLists {
    public static void printList(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }
    public static void maxElement(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(4);
        list.add(5);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println(max);

    }
    
    public static void multiDimenssionArrlist(){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i=1;i<=3;i++){
            l1.add(2*i);
        }
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int i=1;i<=3;i++){
            l2.add(3*i);
        }
        ArrayList<Integer> l3 = new ArrayList<>();
        for(int i=1;i<=3;i++){
            l3.add(4*i);
        }
        list.add(l1);
        list.add(l2);
        list.add(l3);
        System.out.println(list);

    }

    public static int containerMostWater(ArrayList<Integer> list){
        int lp =0;
        int rp = list.size()-1;
        int maxWater = 0;
        while(lp<rp){
            int water = Math.min(list.get(lp), list.get(rp))*(rp-lp);
            maxWater = Math.max(maxWater, water);
            if(lp<rp){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static boolean pairSum(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if (list.get(lp)+list.get(rp)>target) {
                rp--;
            }
            else{
                lp++;
            }
        }
        return false;
    
    }

/**    Monotonic ArrayList (EASY)
An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An
Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
Sample Input 1 : nums = [1,2,2,3]
Sample Output 1 : true
Sample Input 2 : nums = [6,5,4,4]
Sample Output 2 : true
Sample Input 3 : nums = [1,3,2]
Sample Output 3 : false
Constraints :
● 1 <= nums.size() <= 105
● -105 <= nums.get(i) <= 105 */

public static boolean isMonotone(ArrayList<Integer> list){
    boolean isInc = true;
    boolean isDec = true;
    for(int i=0;i<list.size()-1;i++){
        if(list.get(i)>list.get(i+1)){
            isInc = false;
        }
        if(list.get(i)<list.get(i+1)){
            isDec = false;
        }
        
    }
    return isDec || isInc;
}


/* Lonely Numbers in ArrayList (MEDIUM)
You are given an integer arraylist nums. A number x is lonely when it appears only once, and
no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
Return all lonely numbers in nums. You may return the answer in any order.
Sample Input 1 : nums = [10,6,5,8]
Sample Output 1 : [10,8]
Explanation :
- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
- 5 is not a lonely number since 6 appears in nums and vice versa.
Hence, the lonely numbers in nums are [10, 8].
Note that [8, 10] may also be returned.
Sample Input 2 : nums = [1,3,5,3]
Sample Output 2 : [1,5]
Explanation :
- 1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums.
- 5 is a lonely number since it appears exactly once and 4 and 6 does not appear in nums.
- 3 is not a lonely number since it appears twice.
Hence, the lonely numbers in nums are [1, 5].
Note that [5, 1] may also be returned.
Constraints :
● 1 <= nums.size() <= 105
● 0 <= nums.get(i) <= 106 */



public static ArrayList<Integer> lonelyNumber(ArrayList<Integer> list){
    for(int i=0;i<list.size();i++){
        for(int j=1;j<list.size();j++){
            if((list.get(j)==list.get(i)) || (list.get(j)==list.get(i)+1 )|| (list.get(j)==list.get(i)-1)){
                list.remove(j);
                list.remove(i);
            }
        }
    }
    return list;
}

}
