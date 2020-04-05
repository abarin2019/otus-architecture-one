package otus.architecture.one;

import java.util.Arrays;

public class MyStringStack {

    private int capacity;
    private int top;
    private MyString[] stack;


    public MyStringStack() {
        this.capacity = 3;
        this.top = -1;
        this.stack = new MyString[this.capacity];
    }

    public MyStringStack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.stack = new MyString[this.capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTop() {
        return top;
    }

    public void push(MyString myString) {
        stack[++top] = myString;

        if (capacity - top == 2) {
            MyString[] tempStack = new MyString[stack.length];
            System.arraycopy(stack, 0, tempStack, 0, stack.length);
            capacity *= 2;
            stack = new MyString[capacity];
            System.arraycopy(tempStack, 0, stack, 0, tempStack.length);
        }
    }

    public MyString pop() {
        MyString temp = stack[top];
        stack[top--] = null;
        return temp;
    }

    public MyString peek() {
        return stack[top];
    }

    public int isEmpty() {
        if (top == -1) {
            return 1;
        } else {
            return 0;
        }
    }

    public void printStack() {
        System.out.println(Arrays.toString(stack));
    }

    public void printTopAndCapacity() {
        System.out.println("Top = " + top + "    Capacity = " + capacity);
    }

}
