class Main {
    // Method to insert a key at the end of the array
    static int InsertEnd(int arr[], int n, int key, int capacity) {
        // Check if the array is full
        if (n >= capacity) {
            return n; // Return the current size if there's no space
        }
        // Insert the key at the end of the array
        arr[n] = key;
        return n + 1; // Return the new size of the array
    }

    // Method to find an element in the array
    static int findElement(int arr[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i; // Return the index of the element if found
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String args[]) {
        int arr[] = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = 20;
        int n = 6; // Current size of the array
        int key = 26; // Key to be inserted

        // Print the array before insertion
        System.out.println("Before insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Use print instead of println for better formatting
        }
        System.out.println(); // New line after printing the array

        // Insert the key at the end of the array
        n = InsertEnd(arr, n, key, capacity); // Pass the parameters correctly

        // Print the array after insertion
        System.out.println("After insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Use print instead of println for better formatting
        }
        System.out.println(); // New line after printing the array

        // Example of finding an element
        key = 40; // Key to find
        int position = findElement(arr, n, key); // Call the findElement method
        if (position != -1) {
            System.out.println("Element " + key + " found at index: " + position);
        } else {
            System.out.println("Element " + key + " not found.");
        }
    }
}
