package upendra.algo.queue;

import upendra.algo.list.LinkedList;


public class LinkedlistQueue implements Queue {
    private LinkedList list;
    private int front, rare, capacity, size;

    public LinkedlistQueue(int capacity){
        this.list = new LinkedList(capacity + 10);
        this.capacity = capacity;
        this.size = 0;
    }
    public void inQueue(int item){
        // check Queue is overflow
        if(this.isFull()){
            System.out.println("Overflow!");
            return;
        }
        list.insert(item);
        this.size++;
    }
    public int deQueue(){
        if(this.isEmpty()){
            System.out.println("Underflow!");
            return -10 ;
        }
        int item = list.delete();
        this.size--;
        return item;
    }
    public boolean isFull(){
        if(this.size == this.capacity )
            return true;
        else
            return false;
    }
    public boolean isEmpty(){
        if(this.size == 0){
            return true;
        }
        return false;
    }
}
