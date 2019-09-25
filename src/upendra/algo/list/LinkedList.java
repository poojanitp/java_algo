package upendra.algo.list;

public class LinkedList implements List {
    private Node head; // head of list
    private int size=0;
    private int capacity;

    /* Linked list Node inner class*/
    class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }
    public LinkedList(int capacity){
        this.capacity = capacity;
        this.head = null;
    }
    public void insert(int item){
        if(isFull()){
            System.out.println("List is full");
            return;
        }
        Node node = new Node(item);
        if(head == null)
            head = node;
        else{
            Node cur = head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }
    public int delete(){
        if(this.head == null){
            System.out.println("List is empty");
            return -1;
        }
        int item = head.data;
        head = head.next;
        return item;
    }
    public void printList(){
        Node cur = head;
        while(cur != null){
            System.out.print(" "+cur.data);
            cur = cur.next;
        }
        System.out.println("");
    }
    public boolean isFull(){
        if(this.capacity == this.size)
            return true;
        else
            return false;
    }
}
