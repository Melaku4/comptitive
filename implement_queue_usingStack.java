class MyQueue {
  Stack<Integer> stack1 = new Stack();
  Stack<Integer> stack2 = new Stack();

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            shiftStacks();
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            shiftStacks();
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void shiftStacks() {
        while (!stack1.isEmpty()) {
            int temp = stack1.pop();
            stack2.push(temp);
        }
    }
}
