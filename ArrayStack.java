package assignment1;

public class ArrayStack implements Stack<Object> {
    private Object[] pile;
    private int pileSize; 

    public ArrayStack(int capacity) {
        // TASK 2.A.a
        if (capacity < 0) throw new IllegalArgumentException("capacity must be non-negative");
        pile = new Object[capacity];
        pileSize = 0;
    }

    public void push(Object x) {
        // TASK 2.A.b
        if (pileSize == pile.length) throw new RuntimeException("Stack overflow");
        pile[pileSize++] = x;
    }

    public Object pop() {
        // TASK 2.A.c
        if (pileSize == 0) throw new RuntimeException("Stack underflow");
        Object x = pile[--pileSize];
        pile[pileSize] = null;
        return x;
    }

    public Object peek() {
        // TASK 2.A.d
        if (pileSize == 0) throw new RuntimeException("Stack is empty");
        return pile[pileSize - 1];
    }

    public boolean empty() {
        // TASK 2.A.e
        return pileSize == 0;
    }

    public static void main(String[] args) {
        Stack<Object> test = new ArrayStack(20);
        System.out.println(test.empty());
        for (int i=0; i<10; i++) {
            test.push(i+100);
        }
        System.out.println(test.empty());
        System.out.println(test.peek());
        for (int i=0; i<5; i++) {
            int x = (int)test.pop();
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i=0; i<15; i++) {
            test.push(i);
        }
        while (!test.empty()) {
            int x = (int)test.pop();
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
