package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch009MiddleOfLinkedListTest {

    @Test
    void findMiddle() {
        Ch009MiddleOfLinkedList c = new Ch009MiddleOfLinkedList();
        ListNode l1 = new ListNode(1);
        assertEquals(1, c.findMiddle(l1).val);

        l1.next = new ListNode(2);
        assertEquals(2, c.findMiddle(l1).val);

        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        assertEquals(3, c.findMiddle(l1).val);

        l1.next.next.next.next.next = new ListNode(6);
        assertEquals(4, c.findMiddle(l1).val);

        l1.next.next.next.next.next.next = new ListNode(7);
        assertEquals(4, c.findMiddle(l1).val);
    }
}