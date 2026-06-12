package DoublyLinkedList;

public class implementation {

    static Node convertArray(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;


        for(int i = 1; i < arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev = temp;
        }

        return head;
    }

    static Node deleteHead(Node head){
        if(head == null || head.next == null) return null;

        Node prev = head;
        head = head.next;
        head.prev = null;
        prev.next = null;

        return head;


    }

    static Node deleteTail(Node head){

        if(head == null || head.next == null ) return null;

        Node temp = head;

        while (temp.next!=null) {
            temp = temp.next;
        }

        Node newTail = temp.prev;
        newTail.next = null;
        temp.prev = null;

        return head;

    }

    static Node insertBeforeHead(Node head, int value){
    
        Node newHead =new Node(value,head,null);
        head.prev = newHead;

        return head;
    }
    public static void main(String[] args){

    }

    static Node insertBeforeTail(Node head, int value){
        if(head == null) return null;

        Node tail = head;
        while (tail.next!=null) {
            tail = tail.next;
        }

        Node prev = tail.prev;
        Node newNode = new Node(value,tail,tail.prev);
        prev.next = newNode;
        tail.prev = newNode;

        return head;

    }
}
