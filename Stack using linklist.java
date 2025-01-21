// LinkedList.java
public class LinkedList {
   private Node top;
   
   // Node class
   public static class Node {
       public int data;
       public Node next; // next should be a reference to a Node, not an int

       public Node(int data) {
           this.data = data;
       }
   }

   // Insert a new node at the beginning (top) of the list
   public void insertFirst(int data) {
       Node n = new Node(data); 
       n.next = top; // Set the next pointer of the new node to the current top
       top = n; // Update top to the new node
   }

   // Delete the first node (top) of the list
   public Node deletedFirst() {
       if (top == null) {
           return null; // If the list is empty, return null
       }
       Node temp = top;
       top = top.next; // Move the top pointer to the next node
       return temp; // Return the removed node
   }

   // Display all elements in the list
   public void displayList() {
       Node current = top;
       while(current != null) {
           System.out.println(current.data); // Print current node's data
           current = current.next; // Move to the next node
       }
   }
}

// LinkedListStack.java
public class LinkedListStack {
    LinkedList li = new LinkedList();

    // Push an element onto the stack
    public void push(int element) {
        li.insertFirst(element);  
    }

    // Pop the top element from the stack
    public void pop() {
        li.deletedFirst();
    }

    // Display the current stack
    public void displayStack() {
        System.out.println("Stack contents:");
        li.displayList(); // Display the list representing the stack
    }
}

// LLStackClient.java
public class LLStackClient {
    public static void main(String[] args) {
        LinkedListStack st = new LinkedListStack();
        
        // Pushing elements onto the stack
        st.push(50);
        st.push(70);
        st.push(190);
        System.out.println("1. Stack after push operation: ");
        st.displayStack();
        
        // Popping an element from the stack
        System.out.println("\n2. Stack after pop operation: ");
        st.pop();
        st.displayStack();
    }
}
