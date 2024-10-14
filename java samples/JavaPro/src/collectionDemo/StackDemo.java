package collectionDemo;
import java.util.Stack;
import java.util.Vector;
import java.math.BigDecimal;
public class StackDemo {

	public static void main(String[] args) {
		Stack myStack = new Stack();
		System.out.println("myStack => " + myStack);
		myStack.add(new BigDecimal(100));
		myStack.add(200);
		myStack.add(100000);
		myStack.add("Brian Lara!!");
		myStack.add("this is my stack!!! :) ");
		printMyStack(myStack);
		System.out.println("hey...wats on top?" + myStack.peek());
		System.out.println("time to pop some objs!!!");
		myStack.pop();
		System.out.println("status of myStack after popping!!!");
		printMyStack(myStack);
		System.out.println("Capacity of myStack is =>" + myStack.capacity());
		System.out.println("But current size of myStack is =>" + myStack.size());
		myStack.add(2, 5000);
		System.out.println("Modifying the existing structure. ");
		printMyStack(myStack);
	}
	
	public static void printMyStack(Stack myStack) {
		System.out.println("myStack => " + myStack);
		int i=1;
		for(Object obj : myStack) {
			System.out.println((i++) + ") " +obj);
		}
	}
}
