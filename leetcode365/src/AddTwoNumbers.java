public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3, l1);
        addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode pointer = result;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            pointer.next = new ListNode();
            pointer = pointer.next;
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            int number = ((a + b + carry) % 10);
            carry = (a + b + carry) / 10;
            pointer.val = number;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        return result.next;
    }
}

