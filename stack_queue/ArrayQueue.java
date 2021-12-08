package stack_queue;

public class ArrayQueue implements IStackQueue{
    private int[] arr;
    private int SIZE;
    private int headIndex, tailIndex;

    public ArrayQueue(int size) {
        SIZE = size;
        arr = new int[SIZE];
        headIndex = tailIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()){
            if (isEmpty()) headIndex++;
            arr[++tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (isEmpty()) return -1;
        int value = arr[headIndex];
        for (int i=headIndex; i<tailIndex; i++)
            arr[i] = arr[i+1];
        if (--tailIndex == -1)
            headIndex = -1;
        return value;
    }

    @Override
    public boolean isFull() {
        return tailIndex == SIZE-1;
    }

    @Override
    public boolean isEmpty() {
        return (headIndex == -1) && (tailIndex == -1);
    }

    @Override
    public void show() {
        if (isEmpty())
            System.out.println("Queue is empty");
        else {
            for (int i=headIndex; i<= tailIndex; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.push(1);
        arrayQueue.push(2);
        arrayQueue.push(3);
        arrayQueue.push(4);

        arrayQueue.show();

        arrayQueue.pop();
        arrayQueue.show();

        arrayQueue.pop();
        arrayQueue.show();

        arrayQueue.pop();
        arrayQueue.show();

        arrayQueue.pop();
        arrayQueue.show();
    }
}
