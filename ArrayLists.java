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
    ArrayList<Integer> newList = new ArrayList<>();

    for(int i=0;i<list.size();i++){
        int x = list.get(i);
        boolean isAdjacent = false;
        int count =0;
        for(int j=0;j<list.size();j++){
            if(x==list.get(j)){
                count++;
            }
            if(list.get(j)==x+1 || list.get(j)==x-1){
                isAdjacent=true;
            }
        }
        if(count==1 && !isAdjacent){
            newList.add(x);
        }
    }
    return newList;
}
public static ArrayList<Integer> lonelyNumber2(ArrayList<Integer> list){
    Collections.sort(list);
    ArrayList<Integer> newList = new ArrayList<>();
    for(int i=0;i<list.size();i++){
        boolean isUnique = true;
        boolean isAdjacent = true;
        if(i<list.size()-1 && list.get(i)==list.get(i+1)){
            isUnique = false;
        }
        if(i>0 && list.get(i-1)==list.get(i)){
            isUnique = false;
        }
        if(i>0 && list.get(i)-1==list.get(i-1)){
            isAdjacent = false;
        }
        if(i<list.size()-1 && list.get(i+1)==list.get(i)+1){
            isAdjacent = false;
        }
        if(isAdjacent && isUnique){
            newList.add(i);
        }
    }
    return newList;
}

    public static List<Integer> findLonely(int[] nums) {
        // Arrays.sort(nums);
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // Check uniqueness
            boolean isUnique = true;
            if (i > 0 && nums[i] == nums[i - 1]) isUnique = false;
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) isUnique = false;

            // Check adjacency
            boolean hasAdjacent = false;
            if (i > 0 && nums[i] - 1 == nums[i - 1]) hasAdjacent = true;
            if (i < nums.length - 1 && nums[i + 1] == nums[i] + 1) hasAdjacent = true;

            // Final lonely check
            if (isUnique && !hasAdjacent) {
                result.add(nums[i]);
            }
        }

        return result;
    }


/* Most Frequent Number following Key (EASY)
You are given an integer Arraylist nums. You are also given an integer key, which is present in
nums.
For every unique integer target in nums, count the number of times target immediately follows
an occurrence of key in nums. In other words, count the number of indices i such that:
0 <= i <= nums.size() - 2,
nums.get(i) == key and,
nums.get(i+1) == target.
Return the target with the maximum count.
(Assumption - that the target with maximum count is unique.)
Sample Input 1 :nums = [1,100,200,1,100], key = 1
Sample Output 1 : 100
Explanation :
For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key.
No other integers follow an occurrence of key, so we return 100.
Sample Input 2 : nums = [2,2,2,2,3], key = 2
Sample Output 2 : 2
Explanation :
For target = 2, there are 3 occurrences at indices 1, 2, and 3 which follow an occurrence of key.
For target = 3, there is only one occurrence at index 4 which follows an occurrence of key.
target = 2 has the maximum number of occurrences following an occurrence of key, so we
return 2.
Constraints :
● 2 <= nums.size() <= 1000
● 1 <= nums.get(i) <= 1000
● Assume that the answer is unique.
Hints : Count the number of times each target value follows the key in the arraylist.
Choose the target with the maximum count and return it. */



}
// public static int frequentNumber(ArrayList<Integer> list,int key){
//     ArrayList<Integer> count = new ArrayList<>();
//     ArrayList<Integer> target = new ArrayList<>();
//     for(int i=0;i<list.size()-1;i++){
//         int nextNum = list.get(i+1);
//         if(list.get(i)==key){
//             if(target.contains(nextNum)){
//                 int indx = target.indexOf(nextNum);
//             }
//         }
//     }
