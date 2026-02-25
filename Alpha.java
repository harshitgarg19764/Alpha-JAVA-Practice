import java.util.*;
    
public class Alpha {
    public static void main(String[] args) {

        Variable vrb = new Variable();
            // vrb.q1();
            // vrb.q2();
            // vrb.q3();
            // vrb.q4();
            // vrb.q5();

        Conditional cnd = new Conditional();
            // cnd.calc();
            // cnd.q1();
            // cnd.q2();
            // cnd.q3();
            // cnd.q4();
            // cnd.q5();

        Loops lps = new Loops();

            // lps.q1();
            // lps.q2();
            // lps.q3();
            // lps.q4();
            // lps.sum();
            // lps.SquarePattern();
            // lps.ReverseNumber();
            // lps.PrimeNumber();
            // lps.Continue();
            
            Pattern ptn = new Pattern();
            
            // ptn.InvertedStar();
            // ptn.HalfPyramid();
            // ptn.CharacterPyramid();
            



            Method mtd = new Method();
            // mtd.PrimeRange();
            // mtd.BittoDec();
            // mtd.DectoBit();
            // System.out.println(mtd.q1(3,4,5));
            // System.out.println(mtd.q2(6));
            // mtd.q3(121);
            // mtd.q4(4,5);
            // mtd.q5(123);

        AdvancePattern apn = new AdvancePattern();
            // apn.HollowRectangle();
            // apn.InvertedTriangle();
            // apn.InvertedHalfPyramid();
            // apn.FloydTriangle();
            // apn.Triangle01();
            // apn.Butterfly();
            // apn.Rhombus();
            // apn.HollowRhombus();
            // apn.DiamondPattern();
            // apn.NumPyramid();
            // apn.PalindromicNum();

        Arrays arr = new Arrays();
            int num[] = {1,2,3};
            int key = 1;

                // arr.largestNum(num);
                
                // System.out.println(arr.binarySearch(num, key));

                // arr.reverseArray(num);
                //     for(int i=0;i<num.length;i++){
                //         System.out.print( num[i] + " " );
                //     }

                // arr.pairsArray(num);
                // arr.subArrays(num);
                // arr.sumSubArrays(num);
                // System.out.println(arr.q1(num));
                // arr.prefixArr(num);
                // arr.kadanes(num);
                // arr.rainWater(num);
                // arr.buySellStock(num);
                // arr.q3(num);
                // arr.swap(num);

        Sort srt = new Sort();
            int srtArr[] = {10,15,9,3,8};
            // srt.bubbleSort(srtArr);
            // srt.bubbleSortDec(srtArr);

        TwoDimensionArray tda = new TwoDimensionArray();
        int matrix[][]={{1,2,3},{10,10,10},{10,7,12}};
        int keytd =3;
        // tda.minMax();
        // tda.spiralMatrix(matrix);
        // tda.diaognalSum(matrix);
        // tda.staircaseSearch(matrix, keytd);
        // tda.q1(matrix);
        // tda.q2(matrix);
        // tda.q3(matrix);

        Strings str = new Strings();
        String st = "A,B,C,D";
        char stt[] ={'a'};
        String st1 = "dcan";
        // System.out.println(str.pallindromeString(st));
        // str.shortestPath(st);
        // str.toUpercase(st);
        // str.stringCompression(st);
        // str.q1(st);
        // str.q2(st, st1);
        // str.tolower(st);
        // str.reverseStr(st);
        // str.commtoArr(st);
        // System.out.println(str.compress(stt));

        BitManipulation btm = new BitManipulation();
        int n=6;
        // int i=2;
        int j= 2;
        int newBit = 0;
        char ch = 'B';
        // btm.oddEven();
        // btm.getBit(n,i);
        // btm.setBit(n,i);
        // btm.clearBit(n,i);
        // btm.updateBit(n, i, newBit);
        // btm.clearLastBits(n,i);
        // btm.clearRangeBits(n,i,j);
        // System.out.println(btm.isPowerofTwo(n));
        // System.out.println(btm.countSetBits(n));
        // btm.fastExponentation(n, i);
        // btm.swapNumbers(n,i);
        // btm.q3(n);
        // btm.q4(ch);

        // Oops ops = new Oops();

        Recurrsion rcr = new Recurrsion();
        int rcrarr[] = {4,7,2,6,8,2,8,2,8};
        n=0;
        key=2;
        String rcrstr = "abcab";
        String numarr[] = new String[10];
        numarr[0] = "zero";
        numarr[1] = "one";
        numarr[2] = "two";
        numarr[3] = "three";
        numarr[4] = "four";
        numarr[5] = "five";
        numarr[6] = "six";
        numarr[7] = "seven";
        numarr[8] = "eight";
        numarr[9] = "nine";
        // int rcrarr2[] =  new int[5];
        // String str = "";

        // rcr.decNum(10);
        // rcr.incNum(10);
        // System.out.println(rcr.sum(n));
        // System.out.println(rcr.fib(n));
        // System.out.println(rcr.firstOccurence(rcrarr, n, key));
        //? System.out.println(rcr.lastOccurence(rcrarr, n, key));
        // System.out.println(rcr.xPowN(n,key));
        // System.out.println(rcr.tilingProblem(n));
        // System.out.println(rcr.removeDuplicate(rcrstr, n, new StringBuilder(""), new boolean[26]));
        // System.out.println(rcr.friendsPairing(4));
        // System.out.println(rcr.powThree(9));
        // System.out.println(rcr.numPowThree(rcrarr,0));
        // rcr.binaryString(4, 0,"");
        // rcr.countOccurrences1(rcrarr, key, 0);
        // rcr.stringConversion(2010, "", numarr);
        // System.out.println(rcr.countSubstring(rcrstr,0, 0,rcrstr.length(), "",0));
        // rcr.nCoins(2,"");


        DivideConquerer dcr = new DivideConquerer();
        int dcrarr[] = {2,3,5,6,8,9};

        // dcr.mergeSort(dcrarr,0,dcrarr.length-1);
        // dcr.quickSort(dcrarr, 0, dcrarr.length-1);
        // for(int i=0;i<dcrarr.length;i++){
        //     System.out.println(dcrarr[i]);
        // }

        Backtracking btk = new Backtracking();
        int btkarr[]= new int[5];
        String btkstr = "abc";
        // btk.changeArray(btkarr, 0, 1);
        // btk.printArr(btkarr);
        // btk.findSubset(btkstr, 0, "");
        // btk.findPermutations(btkstr, "");
        n=4;
        char board[][] = new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int k=0;k<board[0].length;k++){
                board[i][k]='.';
            }
        }
        
        // btk.nQueens(board, 0);
        // System.out.println("count =" + Backtracking.count);
        // System.out.println(btk.maze(0, 0, 3, 3));
        // System.out.println(btk.ratMaze(matrix,0, 0, 4, 4, null));

        btk.ludo(4,"");
        System.out.println(Backtracking.c);

        int sudoku[][] = {
    {5,3,0,0,7,0,0,0,0},
    {6,0,0,1,9,5,0,0,0},
    {0,9,8,0,0,0,0,6,0},
    {8,0,0,0,6,0,0,0,3},
    {4,0,0,8,0,3,0,0,1},
    {7,0,0,0,2,0,0,0,6},
    {0,6,0,0,0,0,2,8,0},
    {0,0,0,4,1,9,0,0,5},
    {0,0,0,0,8,0,0,7,9}

    
};

// System.out.println(btk.sudoku(sudoku,0, 0));
// btk.printSudoku(sudoku);


        ArrayLists arl = new ArrayLists();
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(4);
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        // list.add(6);
        // list.add(7);
        // list.add(8);
        // list.add(9);
        int arlTarget = 50;
        // arl.printList();
        // arl.maxElement();
        // arl.multiDimenssionArrlist();
        // System.out.println(arl.containerMostWater(list));
        // System.out.println(arl.pairSum(list, arlTarget));
        // System.out.println(arl.isMonotone(list));
        // System.out.println(arl.lonelyNumber(list));


        
        LinkedLists lls = new LinkedLists();
        // lls.addFirst(1);
        // lls.addFirst(2);
        // lls.addLast(2);
        // lls.addLast(3);
        // lls.print();
        // System.out.println(lls.isPalindrome());
        // lls.addMiddle(7, 3);


        // lls.removeFirst();
        // lls.print();
        // lls.removeLast();
        // lls.print();
        // System.out.println(lls.size);
        // System.out.println(lls.iterativeSearch(4));
        // System.out.println(lls.recurssiveSearch(11));
        // lls.reverse();
        // lls.print();   
        // lls.removeNthNode(1);  
        // lls.print();

        // lls.addFirst(5);
        // lls.addLast(4);
        // lls.addLast(3);
        // lls.addLast(2);
        // lls.addLast(1);
        // lls.print();
        // lls.head = lls.mergeSort(lls.head);
        // lls.print();
        // lls.zigzagLL();
        // lls.print();


        DoublyLinkedList dll = new DoublyLinkedList();
        // dll.addFirst(3);
        // dll.addFirst(2);
        // dll.addFirst(1);
        // dll.print();
        // dll.removeFirst();
        // dll.print();
        // dll.addLast(4);
        // dll.print();
        // dll.removeLast();
        // dll.print();
        // dll.reverse();
        // dll.print();

        StackD s = new StackD();
        Stack<Integer> stk = new Stack<>();
        
        int stkarr[] = {6,8,0,1,3};
        String stkstr = "(((a+b)+(c)))";

        stk.push(1);
        stk.push(2);
        stk.push(3);
        // s.pushAtBottom(stk, 4);
        // s.printStack(stk);
        // System.out.println(s.reverseString("abc"));
        // s.reverseStack(stk);
        // s.printStack(stk);
        // s.nextGreaterElement(stkarr);
        // System.out.println(s.validParentheses(stkstr));
        // System.out.println(s.duplicateParentheses(stkstr));


        Queues q = new Queues();
        //! Using LinkedList Class
        Queue<Integer> que =new LinkedList<>();
        
        //! Using ArrayDeque Class
        // Queue<Integer> q =new ArrayDeque<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.add(6);
        que.add(7);
        que.add(8);
        que.add(9);
        que.add(10);

        // q.interleaveQueue(que);
        // q.firstNonRepeatinLetter("aabccxb");
        // q.queueReversal(que);
        // while(!que.isEmpty()){
        //     System.out.println(que.remove());
        // }



        HashSet<Integer> set = new HashSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // System.out.println(set);
        // Iterator it = set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }


        HashMap<String,Integer> map = new HashMap<>();
        
        // map.put("India", 120);
        // map.put("China", 150);
        // map.put("USA", 30);

        // //  System.out.println(map.get(""));
        // for(Map.Entry<String,Integer> e : map.entrySet()){
        //         System.out.println(e.getKey());
        //         System.out.println(e.getValue());
        // }


        Hashmap hmp = new Hashmap();
        int hmparr[] = {1,2,3,4};
        int hmparr2[] = {1,5,6,7};
        // hmp.majiorityElement(hmparr);
        // hmp.unionTwoArray(hmparr, hmparr2);


        
        Greedy grd = new Greedy();
        int grdStart[] = {10,20,30};
        int grdEnd[] = {60,100,120};
        int chain[][]= {{5,24},{39,60},{5,28},{27,40},{50,90}};
        int coins[] = {1,2,5,10,20,50,100,500,2000};
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        // grd.activitySelection(grdStart, grdEnd);
        // grd.fractionalKnapsack(grdStart, grdEnd, 50);
        // grd.minAbsoluteDifference(grdStart, grdEnd);
        // grd.maxChainPairs(chain);
        // grd.IndianCoins(coins, 590);
        // grd.chocola(costVer, costHor);
        // grd.balancedStringPartitions("LRRRRLLRLLRL");






            
        

        
        
    }

        




}
