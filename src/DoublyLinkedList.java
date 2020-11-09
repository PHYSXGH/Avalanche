// a wrapper for the DLL that stores references to the head and tail at all times and provides access to them
// it is sued to create the list and to add nodes to the head and the tail
public class DoublyLinkedList {

    private Node head;
    private Node tail;

    // creates a new DLL with one node that is initialized as both the head and the tail
    public DoublyLinkedList(int initialNodeValue) {
        head = new Node(null, null, initialNodeValue);
        tail = head;
    }

    // returns the head and tail

    public Node getHead() { return head; }

    public Node getTail() { return tail; }

    // adds a node to the head
    public void addToHead(int i) {
        Node newHead = new Node(null, head, i);
        head.setPrecedingNode(newHead);
        head = newHead;
    }

    // adds a node to the tail
    public void addToTail(int i) {
        Node newTail = new Node(tail, null, i);
        tail.setFollowingNode(newTail);
        tail = newTail;
    }
}

// the nodes themselves
// the methods can be used to traverse them, get their "int" value and to delete them
class Node {

    private Node precedingNode;
    private Node followingNode;
    private int value;

    public Node(Node a, Node b, int value) {
        precedingNode = a;
        followingNode = b;
        this.value = value;
    }

    // these are just getters and setters for the attributes to traverse the list

    public Node getPrecedingNode() {
        return precedingNode;
    }

    public Node getFollowingNode() {
        return followingNode;
    }

    public void setPrecedingNode(Node node) {
        precedingNode = node;
    }

    public void setFollowingNode(Node node) {
        followingNode = node;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int i) {
        value = i;
    }

    // this removes the current node that it is called on
    public void removeNode() {
        Node prevNode = precedingNode;
        Node follNode = followingNode;

        prevNode.setFollowingNode(follNode);
        follNode.setPrecedingNode(prevNode);
    }
}
