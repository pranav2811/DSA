package SingelLinkedLists;

public class implementation  {


    static Node convertToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;


        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    static void traverseLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static int lengthOfLL(Node head){
        Node temp = head;
        int counter = 0;
        while(temp!=null){
            temp =temp.next;
            counter++;
        }

            return counter;
    }

    static Node deleteHead(Node head){

        if(head == null) return null;
        head = head.next;
        return head;
    }

    static Node deleteTail(Node head){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    static Node deleteKth(Node head, int k){
        if (head == null) return null;
        Node temp = head;
        Node prev = null;
        

        if(k == 1){
            head = head.next;
            return head;
        }
        int counter = 0;
        while(temp!=null){
            if(counter == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            counter++;
        }

        return head;

    }

    static Node deleteValue(Node head, int value){
        if (head.data == value) {       
            head = null;
            return head;
        }
        Node temp = head;
        Node prev = null;

        while(temp!=null){
            if(temp.data == value){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    static Node insertStarting(Node head, int value){
        Node temp =  new Node(value,head);
        return temp;
    }

    static Node insertLast(Node head, int value){

        if(head == null) return new Node(value);
        Node temp = head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next = new Node(value);
        return head;
    }

    static Node insertAtKth(Node head, int value, int k){
        if (head == null) {
            if(k == 1)
                return new Node(value);
            else
                return null;
        }

        if(k ==1){
            return new Node(value, head);
        }
        Node temp = head;
        Node prev = null;
        int counter = 1;

        while(temp!=null){
            if(counter == k){
                Node newNode = new Node(value, temp);
                prev.next = newNode;
                break;
            }

            prev = temp;
            temp = temp.next;
            counter++;
        }

        return head;
    }

    static Node insertBeforeVal(Node head, int value, int valueBefore){
        if(head == null){
            return null;
        }
        if(head.data == valueBefore){
            return new Node(value,head);
        }
        Node temp = head;

        while(temp!=null){
            if(temp.next.data == valueBefore){
                Node newNode = new Node(value,temp.next);
                temp.next =newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }


    public static void main(String[] args){


        int[] arr = {1,2,3,4,5,6,7,8};
        Node head = convertToLL(arr);
        
        traverseLL(head);
        int length = lengthOfLL(head);
        System.out.println("The length of the linked list is "+length);
        head = deleteHead(head);
        traverseLL(head);
        head = deleteTail(head);
        traverseLL(head);
        head = deleteKth(head, 3);
        traverseLL(head);
        head = deleteValue(head, 7);
        traverseLL(head);
        head = insertStarting(head, 98);
        traverseLL(head);
        head = insertLast(head, 45);
        traverseLL(head);
        head = insertAtKth(head, 65,2);
        traverseLL(head);
        head = insertBeforeVal(head, 34, 65);
        traverseLL(head);


        
    }

}
