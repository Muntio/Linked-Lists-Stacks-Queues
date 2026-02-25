package assignment1;

public class ArrayQueue implements Queue<Object> {
    private Object[] line;
    private int frontIndex;
    private int backIndex;
    private int lineSize;

    public ArrayQueue(int capacity) {
        // TASK 3.A.a
        line = new Object[capacity];
        frontIndex = 0;
        backIndex = 0;
        lineSize = 0;
    }

    public void enqueue(Object x) {
        // TASK 3.A.b
        if (lineSize == line.length) throw new RuntimeException("Queue overflow");
        line[backIndex] = x;
        backIndex = (backIndex + 1) % line.length;
        lineSize++;
    }

    public Object dequeue() {
        // TASK 3.A.c
        if (lineSize == 0) throw new RuntimeException("Queue underflow");
        Object x = line[frontIndex];
        line[frontIndex] = null;
        frontIndex = (frontIndex + 1) % line.length;
        lineSize--;
        return x;
    }

    public Object next() {
        // TASK 3.A.d
        if (lineSize == 0) throw new RuntimeException("Queue is empty");
        return line[frontIndex];
    }

    public boolean empty() {
        // TASK 3.A.e
        return lineSize == 0;
    }

    public static void main(String[] args) {
        Queue<Object> test = new ArrayQueue(20);
        System.out.println(test.empty());
        for (int i = 0; i < 10; i++) {
            test.enqueue(i + 100);
        }
        System.out.println(test.empty());
        System.out.println(test.next());
        for (int i = 0; i < 5; i++) {
            int x = (int) test.dequeue();
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            test.enqueue(i);
        }
        while (!test.empty()) {
            int x = (int) test.dequeue();
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
