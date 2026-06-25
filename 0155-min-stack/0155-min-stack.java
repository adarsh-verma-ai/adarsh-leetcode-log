class MinStack {
    private int[] stack = new int[30001];
    private int[] minStack = new int[30001];
    private int top = -1;
    private int minTop = -1;

    public void push(int value) {
        stack[++top] = value;
        if (minTop == -1 || value <= minStack[minTop]) {
            minStack[++minTop] = value;
        }
    }

    public void pop() {
        if (stack[top] == minStack[minTop]) {
            minTop--;
        }
        top--;
    }

    public int top() {
        return stack[top];
    }

    public int getMin() {
        return minStack[minTop];
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */