class Queue {
    int front, size, capacity;
    int array[];

    public Queue(int length) {
        capacity = length;
        front = size = 0;
        array = new int[capacity];
    }

    boolean isFull() {
        return (size == capacity);
    }

    boolean isEmpty() {
        return (size == 0);
    }

    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        int pos = (front + size) % capacity;
        array[pos] = item;
        size = size + 1;
        System.out.println(item + " enqueued to queue");
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Using -1 to indicate that the queue is empty
        }
        int item = array[front];
        front = (front + 1) % capacity;
        size = size - 1;
        return item;
    }

    int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1; // Using -1 to indicate that the queue is empty
        }
        return array[front];
    }
}

public class Lab07 {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println("Queue size: " + queue.size);
        queue.enqueue(77); // Fixed semicolon error
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Front item is: " + queue.getFront()); // Renamed front() to getFront()
    }
}
