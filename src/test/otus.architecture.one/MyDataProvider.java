//package otus.architecture.one;

import org.testng.annotations.DataProvider;

public class MyDataProvider {

    @DataProvider(name = "dataStrings")
    public static Object[][] createData() {
        return new Object[][] {{"A", "A"}, {"data string", "data string"}, {"Hello, world!", "Hello, world!"},
                               {"beep", "beep"}, {"Go", "Go"}, {"123", "123"}};
    }

    @DataProvider(name = "dataChars")
    public static Object[][] createDataChar() {
        return new Object[][] {{'1', '1'}, {'a', 'a'}, {'B', 'B'}};
    }

    @DataProvider(name = "dataClear")
    public static Object[][] createDataClear() {
        return new Object[][] {{"ABC"}, {"12345"}, {"T"}, {"Rv5$jk;l"}};
    }

    @DataProvider(name = "dataCapacity")
    public static Object[][] createDataCapacity() {
        return new Object[][] {{1, 1}, {5, 5}, {100, 100}};
    }

    @DataProvider(name = "getMyString")
    public static Object[][] createDataGetMyString() {
        return new Object[][] {{"first-string", "first-string".toCharArray()},
                               {"replacement", "replacement".toCharArray()},
                               {"zero", "zero".toCharArray()},
                               {"activated-50", "activated-50".toCharArray()},
                               {"01/04/2020", "01/04/2020".toCharArray()}};
    }

    @DataProvider(name = "getMyStringSymbolsNumber")
    public static Object[][] createDataGetMyStringSymbolsNumber() {
        return new Object[][] {{"first-string", 5, "first"}, {"replacement", 7, "replace"},
                {"zero", 1, "z"}, {"activated-50", 10, "activated-"}, {"01/04/2020", 6, "01/04/"}};
    }

    @DataProvider(name = "getMyStringFromStartPosition")
    public static Object[][] createDataGetMyStringStartPosition() {
        return new Object[][] {{"first-string", 2, 6, "rst-st"}, {"replacement", 5, 4, "ceme"},
                {"zero", 1, 2, "er"}, {"activated-50", 10, 5, "50"}, {"01/04/2020", 5, 5, "/2020"}};
    }

    @DataProvider(name = "addString")
    public static Object[][] addDataString() {
        return new Object[][] {{"Hello", ", world!", "Hello, world!"}, {"Go", " ahead", "Go ahead"},
                               {"Monday+","Friday", "Monday+Friday"}, {"123", "45", "12345"}};
    }

    @DataProvider(name = "stackCapacityConstructor")
    public static Object[][] createStackCapacityConstructor() {
        return new Object[][] {{0, 0}, {1, 1}, {5, 5}, {20, 20}};
    }

    @DataProvider(name = "stackPush")
    public static Object[][] stackPush() {
        return new Object[][] {{6, "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}};
    }

    @DataProvider(name = "stackPeek")
    public static Object[][] stackPeek() {
        return new Object[][] {{"Friday".toCharArray(), "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}};
    }
 }