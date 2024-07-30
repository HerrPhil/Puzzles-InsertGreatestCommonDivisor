import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
import java.math.BigInteger;

public class InsertGreatestCommonDivisor {

    public static void main(String [] args) {
        System.out.printf("Hello Insert Greatest Common Divisor Solution #1%n");
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java InsertGreatestCommonDivisor%n");
            return;
        }

        ListNode<Integer> node3 = new ListNode<>(4, null);

        ListNode<Integer> node2 = new ListNode<>(12, node3);

        ListNode<Integer> head = new ListNode<>(2, node2);
        
        InsertGreatestCommonDivisor insertGcd = new InsertGreatestCommonDivisor(head);

        ListNode<Integer> result = insertGcd.solution();

        System.out.printf("the linked list is now%n");
        ListNode<Integer> curr = result;
        while (curr != null) {
            System.out.printf("List node value: %d%n", curr.value());
            curr = curr.next();
        }
    }

    private ListNode<Integer> head;

    public InsertGreatestCommonDivisor(ListNode<Integer> head) {
        this.head = head;
    }

    public ListNode<Integer> solution() {

        // initialize first 2 nodes to find GCD
        ListNode<Integer> prev = head;
        ListNode<Integer> curr = head.next();

        while (curr != null) {

            int prevValue = prev.value();
            int currValue = curr.value();

            int gcd = BigInteger
                .valueOf((long) prevValue)
                .gcd(BigInteger.valueOf(currValue))
                .intValue();

            ListNode<Integer> gcdNode = new ListNode<>(gcd, curr);
            prev.setNext(gcdNode);

            // move pointers forward
            prev = curr;
            curr = curr.next();

        }

        return head;
    }

}
