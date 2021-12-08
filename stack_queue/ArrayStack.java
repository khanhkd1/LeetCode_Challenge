package stack_queue;

public class ArrayStack implements IStackQueue{
    private int[] arr;
    private int SIZE;
    private int topIndex;

    public ArrayStack(int size) {
        SIZE = size;
        arr = new int[SIZE];
        topIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()){
            arr[++topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()){
            int value = arr[topIndex--];
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return topIndex == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

    @Override
    public void show() {
        if (isEmpty())
            System.out.println("Stack is empty");
        else {
            for (int i=0; i<=topIndex; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);

        arrayStack.show();

        arrayStack.pop();
        arrayStack.show();

        arrayStack.pop();
        arrayStack.show();

        arrayStack.pop();
        arrayStack.show();

        arrayStack.pop();
        arrayStack.show();
    }
}
