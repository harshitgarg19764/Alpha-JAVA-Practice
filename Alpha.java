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
            int num[] = {6,4,7,9};
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
        lls.addFirst(1);
        lls.addFirst(2);
        lls.addLast(2);
        lls.addLast(3);
        lls.print();
        // System.out.println(lls.isPalindrome());
        lls.addMiddle(7, 3);


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


        









        


        





            
        

        
        
    }

        




}
