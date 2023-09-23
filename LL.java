package LinkedList;

class LL { // Scratch Implementation !
    private int size;
    LL () {
        size = 0;
    }
    Node head;
    class Node {
        String data;
        Node next;
        // Creating a Node
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // AddFirst
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        }
    // AddLast
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next; // Updating...
        }
        currNode.next = newNode;
    }
    // Size
    public void getSize() {
        System.out.println(size);
    }
    // RemoveFirst
    public void removeFirst() {
        if(head == null) {
            System.out.println("Nothing to Remove");
            return;
        }
        if(head.next == null) {
            head = null;
            return;
        }
        size--;
        head = head.next;
    }
    // RemoveLast
    public void removeLast() {
        if(head == null) {
            System.out.println("Nothing to Remove");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;

        while(last.next != null) {
            // Updating...
            secondLast = secondLast.next;
            last = last.next;
        }
        secondLast.next = null;
    }
    // ReverseIterative (As it's more Easy I prefer this method!)
    public void reverseIterate() {
        if(head == null || head.next == null) {
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr != null) {
            Node Next = curr.next;
            curr.next = prev;
            // Updating...
            prev = curr;
            curr = Next;
        }
        head.next = null;
        head = prev;
    }
    // ReverseRecursive
    public Node reverseRecursive(Node head) { // return-type Node aahe karan aplyala head badlaycha aahe!
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    //Printing
    public void printList() {
    if(head == null) {
        System.out.println("Empty List");
        return;
    }
    Node currNode = head;
    while(currNode != null) {
        System.out.print(currNode.data+" -> ");
        currNode = currNode.next;
    }
    System.out.println("NULL");
}

    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.printList();
        list.reverseIterate();
        list.printList(); 
        list.head = list.reverseRecursive(list.head); // -> Important Step for this Recursive Approach!
        list.printList();
    }
}