package Stack;

public class ArrayStack{

    private int[] stackArray;
    private int top;
    private int capacity;

    public ArrayStack(int size){
        capacity = size;
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int element){
        if(top >= capacity - 1){
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++top] = element;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArray[top--];

    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }
    public static void main(String[] args){

    }
}