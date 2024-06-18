package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch010StartOfLinkedListCycleTest {

    @Test
    void findCycleStart() {
        Ch010StartOfLinkedListCycle c = new Ch010StartOfLinkedListCycle();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next.next = l3;
        ListNode l4 = new ListNode(4);
        l1.next.next.next = l4;
        l1.next.next.next.next = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next.next.next.next.next = l6;

        l6.next = l3;
        assertEquals(3, c.findCycleStart(l1).val);

        l6.next = l4;
        assertEquals(4, c.findCycleStart(l1).val);

        l6.next = l1;
        assertEquals(1, c.findCycleStart(l1).val);
    }
}