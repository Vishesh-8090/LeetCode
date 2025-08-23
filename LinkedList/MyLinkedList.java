package LinkedList;

public class MyLinkedList {
    MyLinkedList head;
    MyLinkedList tail;
    int val;
    MyLinkedList next;

    public MyLinkedList() {}

    public MyLinkedList(int val) {
        this.val = val;
    }
    public MyLinkedList(int val, MyLinkedList next) {
        this.val = val;
        this.next = next;
    }

    public int get(int index) {
        MyLinkedList node = head;
        for(int i=0; i<=index; i++){
            if(i == index){
                if(node == null){
                    return -1;
                }else{
                    return node.val;
                }
            }
            if(node == null){
                return -1;
            }
            node = node.next;
        }
        return -1;
    }

    public void addAtHead(int val) {
        MyLinkedList node = new MyLinkedList(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
    }

    public void addAtTail(int val) {
        if(tail == null){
            addAtHead(val);
            return;
        }
        MyLinkedList node = new MyLinkedList(val);
        MyLinkedList temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) {
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        MyLinkedList node = new MyLinkedList(val);
        MyLinkedList temp = head;
        for(int i=1; i<index; i++){
            if (temp == null) {
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || head == null) {
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        MyLinkedList temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp.next == null) {
                return;
            }
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
    }
    public void display(){
        MyLinkedList temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addAtHead(1);
        ll.addAtTail(3);
        ll.display();
        ll.addAtIndex(1,2);
        ll.display();
        ll.get(1);
        ll.deleteAtIndex(1);
        ll.get(1);
        ll.display();
    }
}