import java.util.*;
import java.util.Stack;

public class StackD {
    // static ArrayList<Integer> list = new ArrayList<>();
    // public static boolean isEmpty(){
    //     return list.size()==0;
    // }
    // public static void push(int data){
    //     list.add(data);
    // }
    // public static int pop(){
    //     if(isEmpty()){
    //         return -1;
    //     }
    //     int top = list.get(list.size()-1);
    //     list.remove(list.size()-1);
    //     return top;
    // }
    // public static int peek(){
    //     return list.get(list.size()-1);
    // }
    // static class Node{
    //     int data;
    //     Node next;
    //     public Node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }
    // }
    // public static Node head=null;
    // public static boolean isEmpty(){
    //     return head==null;
    // }
    // public static void push(int data){
    //     Node newNode = new Node(data);
    //     if(isEmpty()){
    //         head = newNode;
    //         return;
    //     }
    //     newNode.next = head;
    //     head = newNode;
    // }
    // public static int pop(){
    //     if(isEmpty()){
    //         return -1;
    //     }
    //     int top= head.data;
    //     head=head.next;
    //     return top;
    // }
    // public static int peek(){
    //     if(isEmpty()){
    //         return -1;
    //     }
    //     return head.data;
    // }

    public static void pushAtBottom(Stack<Integer> s,int data){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top = s.pop();
            pushAtBottom(s, data);
            s.push(top);
    }
     
    public static String reverseString(String str){
        Stack <Character> stk = new Stack<>();
        int i=0;
        while(i<str.length()){
            stk.push(str.charAt(i));
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            char curr= stk.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void reverseStack(Stack <Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack <Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void nextGreaterElement(int arr[]){
        int nextGreater[]= new int[arr.length];
        Stack <Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }

    public static boolean validParentheses(String str){
        Stack <Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{'  || str.charAt(i)=='[' ){
                s.push(str.charAt(i));
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && str.charAt(i)== ')') || (s.peek()=='{' && str.charAt(i)== '}' || (s.peek()=='[' && str.charAt(i)== ']'))){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean duplicateParentheses(String str){
        Stack <Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==')'){
                int count =0;
                while(s.pop()!='('){
                    count++;
                }
                if(count<1){
                    return true;
                }
            }
            else{
                s.push(str.charAt(i));
            }
        }
        return false;
    }

}
