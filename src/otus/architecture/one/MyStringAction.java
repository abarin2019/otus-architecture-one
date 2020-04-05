package otus.architecture.one;

public class MyStringAction extends MyString {

    public MyStringAction() {
        super();
    }

    public MyStringAction(String str) {
        super(str);
    }

    public MyStringAction(char symbol) {
        super(symbol);
    }

    public MyStringAction(int capacity) {
        this.capacity = capacity;
        symbolsString = new char[capacity];
        length = 0;
    }

    public char[] getMyString() {
        return symbolsString;
    }

    public char[] getMyString(int symbolsNumber) {
        char[] tempString = new char[symbolsNumber];
        System.arraycopy(symbolsString, 0, tempString, 0, tempString.length);

        return tempString;
    }

    public char[] getMyString(int startPosition, int symbolsNumber) {
        int newArrayLength;

        if (startPosition + symbolsNumber <= symbolsString.length) {
            newArrayLength = symbolsNumber;
        } else {
            newArrayLength = symbolsString.length - startPosition;
        }

        char[] tempString = new char[newArrayLength];
        System.arraycopy(symbolsString, startPosition, tempString, 0, newArrayLength);

        return tempString;
    }

    public void setMyString(String str) {
        if (capacity >= str.length()) {
            length = str.length();
            System.arraycopy(str.toCharArray(), 0, symbolsString, 0, length);
        } else {
            capacity = str.length();
            length = capacity;
            symbolsString = new char[capacity];
            System.arraycopy(str.toCharArray(), 0, symbolsString, 0, length);
        }
    }

    public void add(String str) {
        int tempStringLength = length + str.length();
        char[] tempString = new char[tempStringLength];

        System.arraycopy(symbolsString, 0, tempString, 0, length);
        System.arraycopy(str.toCharArray(), 0, tempString, length, str.length());

        if (tempStringLength <= capacity) {
            length = tempStringLength;
        } else {
            capacity = tempStringLength;
            symbolsString = new char[capacity];
            length = capacity;
        }

        System.arraycopy(tempString, 0, symbolsString, 0, length);
    }
}
