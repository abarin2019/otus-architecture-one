package otus.architecture.one;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyStringActionTest {

    @Test(description = "Testing MyStringAction Constructor(capacity)", dataProvider = "dataCapacity",
            dataProviderClass = MyDataProvider.class)
    public void testMyStringActionCapacity(int in, int expected) {
        MyStringAction myStringAction = new MyStringAction(in);
        int actual = myStringAction.getCapacity();
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Testing getMyString:char[]", dataProvider = "getMyString",
            dataProviderClass = MyDataProvider.class)
    public void testGetMyString(String in, char[] expected) {
        MyStringAction myStringAction = new MyStringAction(in);
        char[] actual = myStringAction.getMyString();
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Testing getMyString(symbolsNumber):char[]", dataProvider = "getMyStringSymbolsNumber",
            dataProviderClass = MyDataProvider.class)
    public void testGetMyStringSymbolsNumber(String in, int symbolsNumber, String expectedStr) {
        MyStringAction myStringAction = new MyStringAction(in);
        char[] actual = myStringAction.getMyString(symbolsNumber);
        char[] expected = expectedStr.toCharArray();
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Testing getMyString(startPosition, symbolsNumber):char[]",
            dataProvider = "getMyStringFromStartPosition", dataProviderClass = MyDataProvider.class)
    public void testGetMyStringStartPosition(String in, int startPosition, int symbolsNumber, String expectedStr) {
        MyStringAction myStringAction = new MyStringAction(in);
        char[] actual = myStringAction.getMyString(startPosition, symbolsNumber);
        char[] expected = expectedStr.toCharArray();
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Testing setMyString:void", dataProvider = "dataStrings",
            dataProviderClass = MyDataProvider.class)
    public void testSetMyString(String in, String expected) {
        MyStringAction myStringAction = new MyStringAction("t0f");
        myStringAction.setMyString(in);
        String actual = myStringAction.toString();
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Testing method add:void", dataProvider = "addString",
            dataProviderClass = MyDataProvider.class)
    public void testAddString(String in, String addStr, String expected) {
        MyStringAction myStringAction = new MyStringAction(in);
        myStringAction.add(addStr);
        String actual = myStringAction.toString();
        Assert.assertEquals(actual, expected);
    }
}
