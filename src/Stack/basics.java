package Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class basics {
    private ListNode top;
    private int length;

    private   class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }
    public void Stack() {
        top = null;
        length = 0;
    }
    public int length() {
        return length;
    }
    public boolean isEmpty() {
        return length == 0;
    }
    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top  = temp;
        length++;
    }
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack<>();
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println(stack.peek());
    }
}