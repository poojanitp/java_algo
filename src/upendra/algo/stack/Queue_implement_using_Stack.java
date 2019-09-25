package upendra.algo.stack;
import upendra.algo.queue.*;
import upendra.algo.stack.*;
public class Queue_implement_using_Stack implements Queue,Stack{
    int capacity,size;
    int array[];
    public Queue_implement_using_Stack(int capacity){
        this.capacity=capacity;
        this.array=new int[this.capacity];
        this.size=-1;
    }

    public boolean isEmpty(){
        if(this.size==-1)
            return true;
        return false;

    }
    public boolean isFull(){
        // System.out.println(this.capacity-1+"--"+this.size);
        if((this.size+1)>=(this.capacity))
            return true;
        return false;
    }
    public void inQueue(int data){
        this.push(data);
    }
    public int deQueue(){

        if(this.isEmpty())
        {
            System.out.println("stack underflow");
            return -111111111;
        }
        else {
            int x = this.pop();
            if (this.isEmpty()) {
                //  System.out.println("---------------" +x);
                return x;
            } else {
                int item=this.deQueue();
                this.inQueue(x);
                return item;
            }
        }
    }
    public void push(int item){

        // System.out.println("Stack OverFlow"+ this.size);
        if(this.isFull()){
            System.out.println("Stack OverFlow");
            return;
        }
        else {
            this.size=this.size+1;
            array[this.size]=item;

        }
    }
    public int pop(){
        int item=array[this.size];
        this.size=this.size-1;
        // System.out.println(item);
        return item;

    }

    public static void main(String args[]){
        Queue_implement_using_Stack qs=new Queue_implement_using_Stack(5);
        qs.inQueue(3);
        qs.inQueue(4);
        System.out.println(qs.deQueue());
        qs.inQueue(5);
        qs.inQueue(6);
        qs.inQueue(7);
        qs.inQueue(8);
        qs.inQueue(9);

        System.out.println(qs.deQueue());   System.out.println(qs.deQueue());   System.out.println(qs.deQueue());
        System.out.println(qs.deQueue());   System.out.println(qs.deQueue());





    }

}
