class MyLinkedList {

    private ListNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1; // Invalid index
        }

        ListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }
    
     public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
        } else {
            ListNode newNode = new ListNode(val);
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            size++;
        }
    }
    
     public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return; // Invalid index
        }

        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            ListNode newNode = new ListNode(val);
            ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return; // Invalid index
        }

        if (index == 0) {
            head = head.next;
        } else {
            ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */