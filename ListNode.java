public class ListNode<T> {

    public static void main(String [] args) {

        System.out.printf("TODO test ListNode%n");

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
