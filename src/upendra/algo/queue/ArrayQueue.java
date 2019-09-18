package upendra.algo.queue;

public class ArrayQueue implements  Queue{
    private int[] arr;
    private int front, rare, capacity;

    public ArrayQueue(int capacity){
        this.front = -1;
        this.rare = -1;
        this.capacity = capacity;
        arr = new int[capacity];
    }
    public void inQueue(int item){
        // check Queue is overflow
        if(this.isFull()){
            System.out.println("Overflow!");
            return;
        }
        if(this.rare == -1 && this.front == -1)
            this.rare = this.front = 0;
        else
            this.rare = (this.rare + 1) % this.capacity;

        arr[this.rare] = item;
    }
    public int deQueue(){
        if(this.isEmpty()){
            System.out.println("Underflow!");
            return -10 ;
        }
        int item = this.arr[this.front];

        if(this.front == this.rare)
            this.front = this.rare = -1;
        else
            this.front = (this.front + 1) % this.capacity;

        return item;
    }
    public boolean isFull(){
        if((this.rare + 1) % this.capacity == this.front)
            return true;
        else
            return false;
    }
    public boolean isEmpty(){
        if(this.rare == -1 && this.front == -1){
            return true;
        }
        return false;
    }

}
