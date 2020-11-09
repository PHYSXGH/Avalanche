import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Begin tests");

        // tests for the general questions
        System.out.println(GeneralTest.fibonacciNumbers(5));
        sortedArrayTest();
        System.out.println(GeneralTest.noOddDigits(0));
        System.out.println(GeneralTest.returnSum(9));

        // test for the balanced brackets
        System.out.println(GeneralTest.balancedBrackets("{[(())]()}"));
        System.out.println(GeneralTest.balancedBrackets("{{}}[[){[[]]()(){}}}"));

        // test for the linked lists
        linkedListTest();
    }

    public static void sortedArrayTest() {
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(4);
        listA.add(5);

        listB.add(3);
        listB.add(4);
        listB.add(5);
        listB.add(6);
        listB.add(7);

        System.out.println(GeneralTest.sortedArrays(listA,listB));
    }

    public static void linkedListTest() {
        DoublyLinkedList list = new DoublyLinkedList(3);

        list.addToTail(4);
        list.addToTail(5);

        list.addToHead(2);
        list.addToHead(1);

        // should now have a list ranging from 1 to 5

        // retrieve the 3rd value
        System.out.println(list.getHead().getFollowingNode().getFollowingNode().getValue());

        // remove the 3rd node
        list.getHead().getFollowingNode().getFollowingNode().removeNode();

        // retrieve the 3rd node again, should be the value '4'
        System.out.println(list.getHead().getFollowingNode().getFollowingNode().getValue());

        //check head and tail
        System.out.println(list.getHead().getValue());
        System.out.println(list.getTail().getValue());

        // check what's before the head, is 'null'
        System.out.println(list.getHead().getPrecedingNode());
    }
}
