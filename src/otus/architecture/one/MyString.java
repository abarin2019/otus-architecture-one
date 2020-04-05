package otus.architecture.one;

public class MyString {

    protected char[] symbolsString;
    protected int length;
    protected int capacity;

    public MyString() {
        capacity = 10;
        symbolsString = new char[capacity];
        length = 0;
    }

    public MyString(String str) {
        length = str.length();
        capacity = length;
        symbolsString = new char[capacity];
        System.arraycopy(str.toCharArray(), 0, symbolsString, 0, length);
    }

    public MyString(char symbol) {
        length = 1;
        capacity = length;
        symbolsString = new char[length];
        symbolsString[0] = symbol;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLength() {
        return length;
    }

    public void clear() {
        length = 0;
    }


    @Override
    public String toString() {
        String outputStr = "";

        for (int i = 0; i < length; i++) {
            outputStr += symbolsString[i];
        }

        return outputStr;
    }
}
