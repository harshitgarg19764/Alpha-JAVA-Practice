import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queues{
    //! Stack Implementation
    // static Stack<Integer> s1 =new Stack<>();
    // static Stack<Integer> s2 =new Stack<>();
    // public static boolean isEmpty(){
    //     return s1.isEmpty();
    // }
    // public static void add(int data){
    //     while(!s1.isEmpty()){
    //         s2.push(s1.pop());
    //     }
    //     s1.push(data);
    //     while(!s2.isEmpty()){
    //         s1.push(s2.pop());
    //     }
    // }
    // public static int remove(){
    //     if(s1.isEmpty()){
    //         System.out.println("queue is Empty");
    //         return -1;
    //     }
    //     return s1.pop();
    // }
    // public static int peek(){
    //      if(s1.isEmpty()){
    //         System.out.println("Queue is Empty");
    //         return -1;
    //     }
    //     return s1.peek();
    // }

    // public static void add(int data){
    //     if (rear ==size-1) {
    //         System.out.println("Queue is Full");
    //         return;
    //     }
    //     rear = rear+1;
    //     arr[rear]=data;
    // }
    // public static int remove(){
    //     if(isEmpty()){
    //         System.out.println("Queue is Empty");
    //         return -1;
    //     }
    //     int front = arr[0];
    //     for(int i=0;i<rear;i++){
    //         arr[i]=arr[i+1];
    //     }
    //     rear = rear -1;
    //     return front;
    // }
    // public static int peek(){
    //     if(isEmpty()){
    //         System.out.println("Queue is Empty");
    //         return -1;
    //     }
    //     return arr[0];
    // }    

    //! LinkedList Implementation
    // public static class Node{
    //         int data;
    //         Node next;
    
    //         Node(int data){
    //             this.data = data;
    //             this.next=null;
    //         }
    // }
    // public static Node head=null;
    // public static Node tail=null;

    // public static boolean isEmpty(){
    //     return head==null && tail==null;
    // }
    // public static void add(int data){
    //     Node newNode = new Node(data);
    //     if(head==null){
    //         head=tail=newNode;
    //         return;
    //     }

    //     tail.next = newNode;
    //     tail = newNode;

    // }
    // public static int remove(){
    //     if(isEmpty()){
    //         System.out.println("Queue is Empty");
    //         return -1;
    //     }
    //     int result = head.data;
    //     if(head==tail){
    //         head=tail=null;
    //     }
    //     else{
    //         head=head.next;
    //     }
    //     return result;
    // }

    // public static int peek(){
    //     if(isEmpty()){
    //         System.out.println("Queue is Empty");
    //         return -1;
    //     }
    //     return head.data;
    // }
    // //! CIRCULAR QUEUE
    // public static int arr[];
    // public static int size;
    // public static int rear;
    // public static int front;

    // public Queues(int n){
    //     arr = new int[n];
    //     size = n;
    //     rear = -1;
    //     front =-1;
    // }
    // public static boolean isEmpty(){
    //     return rear==-1;
    // }


    // public static boolean isFull(){
    //     return (rear+1)%size==front;
    // }
    // public static void add(int data){
    //     if (isFull()) {
    //         System.out.println("Queue is Full");
    //         return;
    //     }
    //     if(front==-1){
    //         front=0;
    //     }
    //     rear = (rear+1)%size;
    //     arr[rear]=data;
    // }
    // public static int remove(){
    //     if(isEmpty()){
    //         System.out.println("Queue is Empty");
    //         return -1;
    //     }
    //     int result = arr[front];
    //     if(rear==front){
    //         rear=front=-1;
    //     }
    //     else{
    //         front = (front+1)%size;
    //     }
    //     return result;
    // }
    // public static int peek(){
    //     if(isEmpty()){
    //         System.out.println("Queue is Empty");
    //         return -1;
    //     }
    //     return arr[front];
    // }

    //! NORMAL IMPLEMENTATION

    // public static void add(int data){
    //     if (rear ==size-1) {
    //         System.out.println("Queue is Full");
    //         return;
    //     }
    //     rear = rear+1;
    //     arr[rear]=data;
    // }
    // public static int remove(){
    //     if(isEmpty()){
    //         System.out.println("Queue is Empty");
    //         return -1;
    //     }
    //     int front = arr[0];
    //     for(int i=0;i<rear;i++){
    //         arr[i]=arr[i+1];
    //     }
    //     rear = rear -1;
    //     return front;
    // }
    // public static int peek(){
    //     if(isEmpty()){
    //         System.out.println("Queue is Empty");
    //         return -1;
    //     }
    //     return arr[0];
    // }

    //! Stack Implemntation using 2 Queue
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();
    public static boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }
    public static void push(int data){
        if(!q1.isEmpty()){
            q1.add(data);
        }
        else{
            q2.add(data);
        }
    }
    public static int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int top =-1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);
            }
        }
        else{
            while(!q2.isEmpty()){
                top=q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
        return top;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int top =-1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                q2.add(top);
            }
        }
        else{
            while(!q2.isEmpty()){
                top=q2.remove();

                q1.add(top);
            }
        }
        return top;
    }
    
    public static void firstNonRepeatinLetter(String str){
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
            q.add(ch);
            while(!q.isEmpty()&& freq[q.peek()-'a']>1){
                q.remove();
            }
        }
        if(q.isEmpty()){
            System.out.println(-1);
        }
        else{
            System.out.println(q.peek());
        }

    }
    public static void interleaveQueue(Queue<Integer> q){
        Queue<Integer> first = new LinkedList<>();
        int size = q.size();
        for(int i=0;i<size/2;i++){
            first.add(q.remove());
        }
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }
    }
    
    public static void queueReversal(Queue<Integer> q){
        Stack<Integer> stk = new Stack<>();
        while(!q.isEmpty()){
            stk.push(q.remove());
        }
        while(!stk.isEmpty()){
            q.add(stk.pop());
        }
    }

}