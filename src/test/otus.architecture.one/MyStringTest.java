//package otus.architecture.one;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyStringTest {

    @Test(description = "Testing MyString Constructor(Literal)", dataProvider = "dataStrings",
            dataProviderClass = MyDataProvider.class)
    public void testMyString(String in, String expected) {
        MyString myString = new MyString(in);
        String actual = myString.toString();
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Testing MyString Constructor(char)", dataProvider = "dataChars",
            dataProviderClass = MyDataProvider.class)
    public void testMyStringChar(char in, char expected) {
        MyString myString = new MyString(in);
        char actual = myString.toString().charAt(0);
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Test length of MyString", dataProvider = "dataStrings",
            dataProviderClass = MyDataProvider.class)
    public void testGetLength(String in, String expected) {
        MyString myString = new MyString(in);
        int actualLength = myString.getLength();
        int expectedLength = expected.length();
        Assert.assertEquals(actualLength, expectedLength);
    }

    @Test(description = "Testing method clear() of MyString", dataProvider = "dataClear",
            dataProviderClass = MyDataProvider.class)
    public void testClearOfMyString(String in) {
        MyString myString = new MyString(in);
        myString.clear();
        int actualLength = myString.getLength();
        int expectedLength = 0;
        Assert.assertEquals(actualLength, expectedLength);
    }
}
