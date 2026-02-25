# Linked-Lists-Stacks-Queues
This project contains my implementation of core linear data structures in Java, developed as part of a Linear Data Structures & Algorithms module.

Rather than using Java’s built-in collections framework, I implemented the following data structures entirely from scratch:

• A Doubly Linked List with bidirectional node traversal
• A Stack using a fixed-size array
• A Dynamic Stack backed by a custom linked list
• A Queue using a fixed-size array
• A Dynamic Queue backed by a custom linked list

Each structure implements its respective abstract data type interface and supports core operations such as insertion, deletion, traversal, push/pop (LIFO), enqueue/dequeue (FIFO), and state validation.

To demonstrate practical application beyond the academic requirements, I extended the completed data structures into a simple library management simulation. In this system:

• The linked list manages the catalogue of books
• The queue models users waiting to borrow books (FIFO behaviour)
• The stack tracks recently returned books or undo-style actions (LIFO behaviour)

This allowed me to apply theoretical data structure concepts to a realistic use case, reinforcing understanding of memory handling, pointer manipulation, and algorithmic behaviour under real-world constraints.

Key concepts demonstrated:

* Object-Oriented Design
* Interface-driven implementation
* Manual memory/reference management
* Time and space trade-offs (static vs dynamic structures)
* Real-world modelling using fundamental data structures

This project highlights both foundational algorithmic knowledge and the ability to translate theory into practical software solutions.
