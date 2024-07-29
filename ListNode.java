public class ListNode<T> {

    public static void main(String [] args) {

        // empty test
        ListNode<String> emptyString = new ListNode<>(null, null);
        String emptyValue = emptyString.value();
        ListNode<String> emptyNext = emptyString.next();
        System.out.printf("empty value is %s%n", emptyValue == null ? "null" : "not null");
        System.out.printf("empty next is %s%n", emptyNext == null ? "null" : "not null");

        // non-empty test
        ListNode<Integer> lastNode = new ListNode<>(123, null);
        ListNode<Integer> firstNode = new ListNode<>(456, lastNode);
        Integer firstValue = firstNode.value();
        ListNode<Integer> nextNode = firstNode.next();
        Integer nextValue = nextNode.value();
        ListNode<Integer> nextNode2 = nextNode.next();
        System.out.printf("first value is %d%n", firstValue);
        System.out.printf("next value is %d%n", nextValue);
        System.out.printf("next node is %s%n", nextNode2 == null ? "null" : "not null");
 
    }

    private T value;
    private ListNode<T> next;

    public ListNode(T value, ListNode<T> next) {

        this.value = value;
        this.next = next;

    }

    public T value() {

        return this.value;

    }

    public ListNode<T> next() {

        return this.next;

    }

}
