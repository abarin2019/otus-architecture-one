package otus.architecture.one;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyStringStackTest {

    @Test(description = "Testing default constructor")
    public void testDefaultConstructor() {
        MyStringStack myStringStack = new MyStringStack();
        int[] actual = {myStringStack.getCapacity(), myStringStack.getTop()};
        int[] expected = {3, -1};
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Testing capacity constructor", dataProvider = "stackCapacityConstructor",
            dataProviderClass = MyDataProvider.class)
    public void testCapacityConstructor(int in, int expected) {
        MyStringStack myStringStack = new MyStringStack(in);
        int actual = myStringStack.getCapacity();
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Testing stack push", dataProvider = "stackPush", dataProviderClass = MyDataProvider.class)
    public void testStackPush(int expectedTop, String... in) {
        MyString myString = new MyString();
        MyStringStack myStringStack = new MyStringStack();

        for (String s : in) {
            myString = new MyString(s);
            myStringStack.push(myString);
            myStringStack.printTopAndCapacity();
        }
        myStringStack.printStack();

        int actualTop = myStringStack.getTop();
        Assert.assertEquals(actualTop, expectedTop);
    }

    @Test(description = "Testing stack pop", dataProvider = "stackPush", dataProviderClass = MyDataProvider.class)
    public void testStackPop(int expectedTop, String... in) {
        MyStringAction myString;
        MyStringStack myStringStack = new MyStringStack();

        for (String s : in) {
            myString = new MyStringAction(s);
            myStringStack.push(myString);
            myStringStack.printTopAndCapacity();
        }
        myStringStack.printStack();

        System.out.println();

        for (int i = 0; i < in.length/2; i++) {
            myString = (MyStringAction) myStringStack.pop();
            myStringStack.printTopAndCapacity();
        }
        myStringStack.printStack();

        int actualTop = myStringStack.getTop();
        Assert.assertEquals(actualTop, expectedTop/2);
    }

    @Test(description = "Testing stack peek", dataProvider = "stackPeek", dataProviderClass = MyDataProvider.class)
    public void testStackPeek(char[] expected, String... in) {
        MyStringAction myString;
        MyStringStack myStringStack = new MyStringStack();

        for (String s : in) {
            myString = new MyStringAction(s);
            myStringStack.push(myString);
            myStringStack.printTopAndCapacity();
        }
        myStringStack.printStack();

        System.out.println();

        myString = (MyStringAction) myStringStack.peek();
        myStringStack.printTopAndCapacity();
        myStringStack.printStack();

        System.out.println("Peek data = " + myString);
        char[] actual = myString.toString().toCharArray();

        Assert.assertEquals(actual, expected);
    }
}
