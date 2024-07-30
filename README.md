# Puzzles-InsertGreatestCommonDivisor

Add a node of two adjacent nodes, and make its value the gcd of the values of the two nodes.

## Lesson Task Description

This lesson task includes the concept of linked list.

For this lesson task, we will roll our own linked list, and forego using the java.util.LinkedList.

The most basic linked list can be created from instances of a class, ListNode,
whose member variables are a value and a reference to the next ListNode.

One or more of these ListNodes create a "linked list".

The goal is, for example, given this:

```
[2] -> [12] -> [4]
```

turn it into this:

```
[2] -> [2] -> [12] -> [4] -> [4]
```

The algorithm will initialize a pointer, prev, to the head of the linked list.

The algorithm will initialize a pointer, curr, to the head.next of the linked list.

The algorithm calculates the GCD of prev and curr values.

The algorithm instantiates a new ListNode, whose value is the GCD.

The algorithm fixes the connections of the list.

The algorithm sets prev.next to be the new node.

The algorithm sets newNode.next to be the curr node.

The algorithm keeps this going by setting prev to be curr,
and curr to be curr.next.

The algorithm stop condition is when curr is null.

This is when curr goes out of bounds.

Then the solution returns head where the modified linked list can be,
for example, printed out.

As well, we are not going to implement the gcd() function,
even though we did that in a previous lesson task.

Note that the JDK provides this function in java.math.BigInteger,
where gcd(abs(this), abs(value)) is returned.
