class PalindromeList {
    public int lPalin(ListNode A) {
        if (A.next == null)
            return 1;
        ListNode headOne = A;
        ListNode headTwo = null;

        ListNode fastPointer = A;
        ListNode slowPointer = A;

        while (fastPointer.next != null && fastPointer.next.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        headTwo = slowPointer.next;
        slowPointer.next = null;

        headTwo = reverseList(headTwo);

        while (headOne != null && headTwo != null) {
            if (headOne.val != headTwo.val)
                return 0;
            headOne = headOne.next;
            headTwo = headTwo.next;
        }

        return 1;
    }

    public ListNode reverseList(ListNode A) {
        ListNode prev = null;
        ListNode curr = A;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}