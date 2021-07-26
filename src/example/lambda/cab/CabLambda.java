package example.lambda.cab;

@FunctionalInterface
interface Cab { //When an interface has exactly one abstract method, it's a Functional Interface
//	void bookCab(); // By default, public abstract void bookCab();
//	void bookCab(String source, String destination); // By default, public abstract void bookCab();
	double bookCab(String source, String destination); // By default, public abstract void bookCab();
}

//class UberX implements Cab {
//	public void bookCab() {
//	System.out.println("Uber X booked! Your cab will be arriving soon!");
//	}
//}

public class CabLambda {
	public static void main(String[] args) {
		
		// 1° way
		//		Cab cab = new UberX(); // Polymorphic statement
		//		cab.bookCab();
		
		// 2° way
		// Anonymous class Implementation
//		Cab cab = new Cab() {
//			@Override
//			public void bookCab() {
//				System.out.println("Uber X booked! Your cab will be arriving soon!");
//			}
//		};
//		
//		cab.bookCab();
		
		// 3° way
		// Using a Lambda Expression -> Function Interfaces
		Cab cab = (source, destination)->{
			System.out.println("Uber X booked! Your cab from " + source + " will be arriving soon and will be taking you to " + destination);
			return 102.13;
		};
		
		
		double fare = cab.bookCab("Los Angeles", "San Francisco");
		System.out.println("The fare will cost US$ " + fare);
	}
}
