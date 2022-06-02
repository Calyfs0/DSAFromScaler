public class AddTwoNumbersAsList {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        if(A==null) return B;
        if(B == null) return A;
        int carry = 0;
        int value = 0;
        int sum = 0;

        ListNode resultHead = new ListNode(0);
        ListNode curr = resultHead;

        while(A!=null || B!= null || carry > 0){
            sum = carry;
            if(A!= null){
                sum += A.val;
                A = A.next;
            }
            if(B!= null){
                sum += B.val;
                B = B.next;
            }

            carry = sum/10;
            value = sum%10;
            ListNode newNode = new ListNode(value);
            curr.next = newNode;
            curr = curr.next;
        }

        

        return resultHead.next;

    }
}
