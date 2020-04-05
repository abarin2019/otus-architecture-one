package otus.architecture.one;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyStringAction myString = new MyStringAction();
        System.out.println();
        System.out.println("Default MyString:");
        System.out.println("Capacity = " + myString.getCapacity());
        System.out.println("String = " + myString);
        System.out.println("Length = " + myString.getLength());
        System.out.println("----------------");

        myString.setMyString("Access granted");
        System.out.println("MyString after setMyString(Access granted):");
        System.out.println("Capacity = " + myString.getCapacity());
        System.out.println("String = " + myString);
        System.out.println("Length = " + myString.getLength());
        System.out.println("----------------");

        myString.setMyString("new data");
        System.out.println("MyString after setMyString(new data):");
        System.out.println("Capacity = " + myString.getCapacity());
        System.out.println("String = " + myString);
        System.out.println("Length = " + myString.getLength());
        System.out.println("----------------");

        MyStringAction myStringAction = new MyStringAction("Dependency-Inversion Principle");
        System.out.println("New string action = " + myStringAction);
        System.out.println("New string action by using method: getMyString(17):char[]:");

        for (int i = 0; i < myStringAction.getMyString(17).length; i++) {
            System.out.print(myStringAction.getMyString(17)[i]);
        }
        System.out.println();

        System.out.println("---------------------------");

        MyStringAction myStringAction2 = new MyStringAction("Dependency-Inversion Principle");
        System.out.println("New string action = " + myStringAction2);
        System.out.println("New string action by using method: getMyString(5, 17):char[]:");

        for (int i = 0; i < myStringAction2.getMyString(5, 17).length; i++) {
            System.out.print(myStringAction2.getMyString(5, 17)[i]);
        }
        System.out.println();

        System.out.println("---------------------------");

        MyString myString2 = new MyString("Hello, world!");
        System.out.println("Capacity = " + myString2.getCapacity());
        System.out.println("String = " + myString2);
        System.out.println("Length = " + myString2.getLength());
        System.out.println("----------------");

        MyString myString3 = new MyString('T');
        System.out.println("Capacity = " + myString3.getCapacity());
        System.out.println("String = " + myString3);
        System.out.println("Length = " + myString3.getLength());
        System.out.println("----------------");

        System.out.println("MyString2 = " + myString2);
        System.out.println("MyString2 after clear():");
        myString2.clear();
        System.out.println("Capacity = " + myString2.getCapacity());
        System.out.println("String = " + myString2);
        System.out.println("Length = " + myString2.getLength());


        MyStringAction myStringAction1 = new MyStringAction();
        myStringAction1.setMyString("One-two-three-four-five");
        System.out.println();
        System.out.println("MyStringAction1:");
        System.out.println("Capacity = " + myStringAction1.getCapacity());
        System.out.println("String = " + myStringAction1);
        System.out.println("Length = " + myStringAction1.getLength());
        System.out.println("------------------");
        myStringAction1.add("-six-seven-eight");
        System.out.println("MyStringAction1 after add new string: -six-seven-eight:");
        System.out.println("Capacity = " + myStringAction1.getCapacity());
        System.out.println("String = " + myStringAction1);
        System.out.println("Length = " + myStringAction1.getLength());

        //MyStringStack:
        System.out.println();
        MyStringStack stack = new MyStringStack();
        stack.push(new MyString("January"));
        stack.printStack();
        stack.push(new MyString("February"));
        stack.printStack();
        stack.push(new MyString("March"));
        stack.printStack();
        stack.push(new MyString("April"));
        stack.printStack();

        MyString myString1 = stack.pop();
        System.out.println("Deleted month = " + myString1);
        stack.printStack();

        MyString myString4 = stack.peek();
        System.out.println("Read month = " + myString4);
        stack.printStack();

        System.out.println();
        System.out.println("Adding month May:");
        stack.push(new MyString("May"));
        stack.printStack();
        System.out.println();

        System.out.println("Adding month June:");
        stack.push(new MyStringAction("June"));
        stack.printStack();


    }
}
