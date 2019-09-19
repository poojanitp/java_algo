package upendra.algo.queue;

public class ArrayQueue implements  Queue{
    private int[] arr;
    private int front, rare, capacity, size;

    public ArrayQueue(int capacity){
        this.front = 0;
        this.rare = 0;
        this.capacity = capacity;
        this.size = 0;
        arr = new int[capacity];
    }
    public void inQueue(int item){
        // check Queue is overflow
        if(this.isFull()){
            System.out.println("Overflow!");
            return;
        }
        arr[this.rare] = item;
        this.rare = (this.rare + 1) % this.capacity;
        this.size++;
    }
    public int deQueue(){
        if(this.isEmpty()){
            System.out.println("Underflow!");
            return -10 ;
        }
        int item = this.arr[this.front];
        this.front = (this.front + 1) % this.capacity;
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
