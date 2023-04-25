package JavaPrograms;

import java.io.IOException;
import java.util.Scanner;

public class BasicInput {

	public static String readString() throws IOException {
		byte b[] = new byte[255];
		int length = System.in.read(b);
		byte bt[] = new byte[length-1];
		System.arraycopy(b, 0, bt, 0, length-1);
		String s = new String(bt);
		return s;				
	}

	public static int readInteger() throws IOException {
		String s = readString().trim();
		int i = Integer.parseInt(s);
		return i;

	}

	public static float readFloat() throws IOException {
		String s = readString().trim();
		float f = Float.parseFloat(s);
		return f;
	}

	public static void show() {
		Scanner input = new Scanner(System.in); 
		int choice; 
		double num1, num2; 
		System.out.println("Calculator Program"); 
		System.out.println("1. Add");
		System.out.println("2. Subtract"); 
		System.out.println("3. Multiply"); 
		System.out.println("4. Divide"); 
		System.out.print("\nEnter your choice (1-4): "); 
		choice = input.nextInt();
		switch (choice) { case 1: System.out.print("\nEnter first number: ");
		num1 = input.nextDouble();
		System.out.print("Enter second number: ");
		num2 = input.nextDouble(); 
		System.out.println("Result: " + (num1 + num2));
		break;
		case 2: System.out.print("\nEnter first number: ");
		num1 = input.nextDouble(); 
		System.out.print("Enter second number: ");
		num2 = input.nextDouble(); 
		System.out.println("Result: " + (num1 - num2));
		break; 
		case 3: System.out.print("\nEnter first number: "); 
		num1 = input.nextDouble();
		System.out.print("Enter second number: ");
		num2 = input.nextDouble();
		System.out.println("Result: " + (num1 * num2));
		break; 
		case 4: System.out.print("\nEnter first number: ");
		num1 = input.nextDouble(); 
		System.out.print("Enter second number: ");
		num2 = input.nextDouble();
		if (num2 == 0) {
			System.out.println("Error: divide by zero"); 
		} 
		else { 
			System.out.println("Result: " + (num1 / num2)); 
		} 
		break; 
		default: System.out.println("Invalid choice");
		break;
		}
		input.close(); 
	} 

}
