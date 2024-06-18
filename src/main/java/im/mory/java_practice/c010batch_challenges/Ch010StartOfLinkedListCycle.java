package im.mory.java_practice.c010batch_challenges;

public class Ch010StartOfLinkedListCycle {
     ListNode findCycleStart(ListNode head) {
        ListNode slow = head, fast = head;
        int cycleLength = 0;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                cycleLength = findCycleLength(slow);
                break;
            }
        }
        return cycleStart(head, cycleLength);
    }

    int findCycleLength(ListNode start) {
        int length = 1;
        var pointer = start.next;
        while (pointer != start) {
            pointer = pointer.next;
            length++;
        }
        return length;
    }

    ListNode cycleStart(ListNode head, int cycleLength) {
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        for (int i = 0; i < cycleLength; i++) {
            pointer2 = pointer2.next;
        }
        while (pointer1 != pointer2) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer1;
    }
}
