package Medium;

/**
 * 
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * 
 * @author Kuanyow Chen (Dennis)
 */
public class Add_Two_Numbers {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode i = l1, j = l2, current = result;
        int carry = 0;
        
        while (i != null || j != null) {
            
            int x = (i != null) ? i.val: 0;
            int y = (j != null) ? j.val: 0;
            
            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            
            current = current.next;
            if (i != null) i = i.next;
            if (j != null) j = j.next;
        }
        
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        
        return result.next;
    }

}
