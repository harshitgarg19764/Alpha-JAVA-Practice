public class LinkedLists {   
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next=null;
        }
    }

    public static LinkedLists.Node head;
    public static LinkedLists.Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //create new node
        newNode.next = head;
        head = newNode;


    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //create new node
        tail.next = newNode;
        tail = newNode ;


    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int data,int indx){
        if(indx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<indx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0; 
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0; 
            return val;
        }
        int i=0;
        Node prev = head;
        while(i<size-2){
            prev = prev.next;
            i++;
        }
        int val = prev.next.data;
        prev.next = null;
        prev =tail;
        size--;
        return val;
    }
    public int iterativeSearch(int target){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==target){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }
    public int helper(Node ll,int key){
        if(ll==null){
            return -1;
        }
        if(ll.data==key){
            return 0;
        }
        int idx = helper(ll.next, key);
        if(idx ==-1){
            return -1;
        }
        return idx+1;
    }

    public int recurssiveSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node curr =tail=head;
        Node prev =null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        head =prev;

    }

    public void removeNthNode(int n){
        if(n==size){
            head = head.next;
            return;
        }
        int i=1;
        Node prev =head;
        while(i<size-n){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public Node midNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=head.next.next;
        }
            return slow;
    }
    public boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node midNode = midNode(head);
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left = head;
        Node right = prev;
        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }

    public static boolean isCycle(){
        Node slow =head;
        Node fast=head;
        while(fast !=null && fast.next!=null){
            if(slow==fast){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
    public static void removeCycle(){
        Node slow =head;
        Node fast =head;
        boolean exists = false;
        while(fast !=null && fast.next!=null){
            if(slow==fast){
                exists=true;
                break;
            }
            slow=slow.next;
            fast=fast.next.next;

        }
        if(exists==false){
            return;
        }
        slow =head;
        Node prev = null;
        
        while(slow!=fast){
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }
        prev.next=null;
    }

}
