package example.lambda.methods;

// Functional Interface
interface Calculator {
	void add(int num1, int num2);
}

class Calc {
	public static void addSomething(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("The sum is: " + result);
	}
	public static void letsAdd(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("The sum is: " + result);
	}
}

//Functional Interface
interface Messenger{
	Message getMessage(String msg);
}

class Message{
	Message(String msg){
		System.out.println("The message is: " + msg);
	}	
}

public class MethodReferences {
	public static void main(String[] args) {
//		Calc.addSomething(3, 4);
		
		// 1. Reference to a Static Method
//		Calculator cRef = Calc::addSomething; // Method Reference
//		cRef.add(2, 4);
		
		// 2. Reference to a non static method or Instance Method
//		Calc calc = new Calc();
//		Calculator cRef = Calc::letsAdd; // Method Reference
//		cRef.add(6, 4);
		
		// 3. Reference to a Constructor
		Messenger mRef = Message::new; // Method Reference
		mRef.getMessage("That's the message you got!");
	}
}
