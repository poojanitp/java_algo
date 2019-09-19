import upendra.Rotation;
import upendra.algo.stack.*;
import upendra.algo.queue.*;

public class Main {


    public static void main(String args[]){
//        Queue q1=new ArrayQueue(4);
//        q1.inQueue(10);
//        System.out.println(q1.deQueue());
//        System.out.println(q1.deQueue());
//        q1.inQueue(20);
//        q1.inQueue(30);
//        System.out.println(q1.deQueue());
//        q1.inQueue(40);
//        q1.inQueue(50);
//        System.out.println(q1.deQueue());
//        System.out.println(q1.deQueue());
//        System.out.println(q1.deQueue());
//        System.out.println(q1.deQueue());
//        System.out.println(q1.deQueue());
//        q1.inQueue(60);

        StackByQueue s1=new StackByQueue(5);
        s1.push(10);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        s1.push(20);
        s1.push(30);
        System.out.println(s1.pop());
        s1.push(40);
        s1.push(50);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        s1.push(60);
        System.out.println(s1.pop());
    }
}
