package assignment1;

public class DoubleLinkedList implements List<Object> {
    private class BookSlot {
        public BookSlot(Object x) {
            book = x;
        }
        public Object book;
        public BookSlot prev = null;
        public BookSlot next = null;
    }

    private final BookSlot shelfStart;
    private final BookSlot shelfEnd;
    private int bookCount;

    public DoubleLinkedList() {
        // TASK 1.A
        shelfStart = new BookSlot(null);
        shelfEnd = new BookSlot(null);
        shelfStart.next = shelfEnd;
        shelfEnd.prev = shelfStart;
        bookCount = 0;
    }

    public void prepend(Object x) {
        // TASK 1.B
        BookSlot slot = new BookSlot(x);
        BookSlot firstSlot = shelfStart.next;
        slot.prev = shelfStart;
        slot.next = firstSlot;
        shelfStart.next = slot;
        firstSlot.prev = slot;
        bookCount++;
    }

    public Object getFirst() {
        // TASK 1.C
        if (bookCount == 0) throw new RuntimeException("List is empty");
        return shelfStart.next.book;
    }

    public void deleteFirst() {
        // TASK 1.D
        if (bookCount == 0) throw new RuntimeException("List is empty");
        BookSlot firstSlot = shelfStart.next;
        BookSlot secondSlot = firstSlot.next;
        shelfStart.next = secondSlot;
        secondSlot.prev = shelfStart;
        bookCount--;
    }

    public void append(Object x) {
        // TASK 1.E
        BookSlot slot = new BookSlot(x);
        BookSlot lastSlot = shelfEnd.prev;
        slot.next = shelfEnd;
        slot.prev = lastSlot;
        lastSlot.next = slot;
        shelfEnd.prev = slot;
        bookCount++;
    }

    public Object getLast() {
        // TASK 1.F
        if (bookCount == 0) throw new RuntimeException("List is empty");
        return shelfEnd.prev.book;
    }

    public void deleteLast() {
        // TASK 1.G
        if (bookCount == 0) throw new RuntimeException("List is empty");
        BookSlot lastSlot = shelfEnd.prev;
        BookSlot beforeLastSlot = lastSlot.prev;
        beforeLastSlot.next = shelfEnd;
        shelfEnd.prev = beforeLastSlot;
        bookCount--;
    }

    public boolean empty() {
        // TASK 1.H
        return bookCount == 0;
    }

    public static void main(String[] args) {
        List<Object> test = new DoubleLinkedList();
        System.out.println(test.empty());
        for (int i = 0; i < 10; i++) {
            test.prepend(i + 100);
        }
        System.out.println(test.empty());
        for (int i = 0; i < 5; i++) {
            int x = (int) test.getFirst();
            System.out.print(x + " ");
            test.deleteFirst();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            test.append(i + 200);
        }
        while (!test.empty()) {
            int x = (int) test.getLast();
            System.out.print(x + " ");
            test.deleteLast();
        }
    }
}
