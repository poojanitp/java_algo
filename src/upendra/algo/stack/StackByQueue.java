package upendra.algo.stack;
import upendra.algo.queue.*;

import java.util.TreeMap;

public class StackByQueue implements Stack {
    private Queue q1, q2;
    public StackByQueue(int size){
        q1= new ArrayQueue(size);
        q2 = new ArrayQueue(size);
    }
    public void push(int item){
        // if q1 has item then insert into it else insert into q2
        // at a time only one queue has elements
        if(!q1.isEmpty()){
            q1.inQueue(item);
        }else{
            q2.inQueue(item);
        }
    }
    public int pop(){
        // if queue1 has the item then remove all and push to queue2 except last item and return last item
        if(this.isEmpty()){
            System.out.println("Stack Empty");
            return -10;
        }
        if(!q1.isEmpty()){
            int item = 0;
            while (!q1.isEmpty()){
                item = q1.deQueue();
                if(!q1.isEmpty())
                    q2.inQueue(item);
            }
            return item;
        }
        else{
            int item = 0;
            while (!q2.isEmpty()){
                item = q2.deQueue();
                if(!q2.isEmpty())
                    q1.inQueue(item);
            }
            return item;
        }
    }

    public boolean isEmpty(){
        if(q1.isEmpty() && q2.isEmpty())
            return true;
        else
            return false;
    }
}
