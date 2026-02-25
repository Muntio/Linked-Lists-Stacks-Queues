package assignment1;

public class DynamicStack implements Stack<Object> {
    List<Object> pile = new DoubleLinkedList();

    public void push(Object x) {
        // TASK 2.B.a
        pile.append(x);
    }

    public Object pop() {
        // TASK 2.B.b
        if (pile.empty()) throw new RuntimeException("Stack underflow");
        Object x = pile.getLast();
        pile.deleteLast();
        return x;
    }

    public Object peek() {
        // TASK 2.B.c
        if (pile.empty()) throw new RuntimeException("Stack is empty");
        return pile.getLast();
    }

    public boolean empty() {
        // TASK 2.B.d
        return pile.empty();
    }

    public static void main(String[] args) {
        Stack<Object> test = new DynamicStack();
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
