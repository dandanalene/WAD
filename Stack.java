package stack;

import java.util.Scanner;

public class Stack {
    private int capacity; 
    private int top;
    private String[] storage;
    
    
    public Stack(int size){
        capacity = size;
        storage = new String[capacity];
    }
    
    public void show(){
        for (int i=capacity-1; i>=0 ; i--){
            System.out.print("\n storage[" + i + "] = (" + storage[i] + ") Value\n");
        }
        System.out.println();
    }
    
    private boolean isEmpty(){
        if (storage[capacity] == null){
            System.out.print("\n ERROR 101 (the stack is empty now)\n");
            return true;
        }
        return false;
    }
    
    private boolean isFull() {
    if (top == capacity) {
        System.out.print("\n ERROR 1001 (the stack is full already)\n");
         return true;
    } 
    return false;
  }
    
    public void push(String value) {
    if (isFull()) {
      System.out.println();
    } 
    else {
      System.out.println("\n ... trying to push on stack[" + top + "] ...");
      storage[top] = value;
      top++;
      System.out.println("'" + value + "' was successfully added.");
      System.out.println();
    }
  }
    public void pop() {
    if (isEmpty()) {
      System.out.println();
    } 
    else {
      System.out.println("\n ... trying to pop stack[" + (top-1) + "] ...");
      storage[top] = storage[top-1];
      top--;
      System.out.println("\n'" + storage[top] + "' was successfully removed.\n");
      System.out.println();
    }
  }
    
    public void peek() {
    if (storage[top] == storage[0]) {
      System.out.println("\nPEEK TOP = " + storage[top]);
      System.out.println();
    } else {
      System.out.println("\nPEEK TOP = " + storage[top-1]);
      System.out.println();
    }
  }
    public static void main(String[] args) {
        int limit = 10;
        Stack storage = new Stack(limit);
        
        System.out.println("STORAGE CAPACITY = " + limit);
        System.out.println();
        storage.push("one");
        storage.show();
        storage.push("two");
        storage.show();
        storage.push("three");
        storage.show();
        storage.push("four");
        storage.show();
        storage.push("five"); 
        storage.show();
        storage.push("six"); 
        storage.show();
        storage.push("seven"); 
        storage.show();
        storage.push("eight"); 
        storage.show();
        storage.push("nine");  
        storage.show();
        storage.push("ten");
        storage.show();
        storage.push("eleven"); 
        storage.isFull();
        storage.push("twelve"); 
        storage.isFull();
        storage.show(); 
    }
}
