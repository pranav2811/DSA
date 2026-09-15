package Stack;


public class LinkedListStack {

    private class Node{

        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }

    }

    private Node top;
    private int size;

    public LinkedListStack(){
        top = null;
        size = 0;
    }


    public void push(int x){
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        size--;
        return value;

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
}
