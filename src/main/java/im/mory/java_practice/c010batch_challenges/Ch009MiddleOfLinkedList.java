package im.mory.java_practice.c010batch_challenges;

public class Ch009MiddleOfLinkedList {
    ListNode findMiddle(ListNode head) {
        ListNode slowRabbit = head;
        ListNode fastRabbit = head;
        while (fastRabbit != null && fastRabbit.next != null) {
            fastRabbit = fastRabbit.next.next;
            slowRabbit = slowRabbit.next;
        }
        return slowRabbit;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}