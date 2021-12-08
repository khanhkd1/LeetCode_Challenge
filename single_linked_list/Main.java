package single_linked_list;

public class Main {
    public static void printLinkedList(Node head){
        if (head == null)
            System.out.println("linked list is empty");
        else {
            Node temp = head;
            while (temp != null){
                System.out.print(temp.value);
                if (temp.next != null)
                    System.out.print("->");
                else System.out.println();
                temp = temp.next;
            }
        }
    }

    public static Node addNodeToHead(Node head, int value){
        Node newNode = new Node(value);
        if (head != null)
            newNode.next = head;
        return newNode;
    }

    public static Node addNodeToTail(Node head, int value){
        Node newNode = new Node(value);
        if (head == null)
            return newNode;
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        return head;
    }

    public static Node addNodeToIndex(Node head, int value, int index){
        if (index == 0)
            return addNodeToHead(head, value);
        Node curNode = head;
        int count = 0;

        while (curNode.next != null){
            count++;
            if (count == index){
                Node insertNode = new Node(value);
                insertNode.next = curNode.next;
                curNode.next = insertNode;
                break;
            }
            curNode = curNode.next;
        }
        return head;
    }

    public static Node removeHeadNode(Node head){
        if (head != null)
            return head.next;
        return null;
    }

    public static Node removeTailNode(Node head){
        if (head == null)
            return null;
        Node lastNode = head;
        Node prevNode = null;

        while (lastNode.next != null){
            prevNode = lastNode;
            lastNode = lastNode.next;
        }
        if (prevNode == null)
            return null;
        prevNode.next = null;
        return head;
    }

    public static Node removeAtIndex(Node head, int index){
        if (head == null || index < 0)
            return null;
        else if (index == 0)
            return removeHeadNode(head);
        else {
            Node curNode = head;
            Node prevNode = null;
            int count = 0;
            while (curNode.next != null){
                count++;
                prevNode = curNode;
                curNode = curNode.next;

                if (count == index){
                    prevNode.next = curNode.next;
                    break;
                }
            }
            return head;
        }
    }

    public static void main(String[] args) {
        Node node1 = new  Node(1);
        Node node2 = new  Node(2);
        Node node3 = new  Node(3);

        node1.next = node2;
        node2.next = node3;

        printLinkedList(node1);

        Node node0 = addNodeToHead(node1, 0);
        printLinkedList(node0);

        node0 = addNodeToTail(node0, 4);
        printLinkedList(node0);

        node0 = addNodeToIndex(node0, 5, 3);
        printLinkedList(node0);

        node0 = removeHeadNode(node0);
        printLinkedList(node0);

        node0 = removeTailNode(node0);
        printLinkedList(node0);

        node0 = removeAtIndex(node0, 3);
        printLinkedList(node0);
    }
}
