package upendra.algo.queue;

public interface Queue {
    int size=10;
    public void inQueue(int item);
    public int deQueue();
    public boolean isEmpty();
    public boolean isFull();
}
