/*
Create a program that:

Takes a string input

Print:

Uppercase version
Lowercase version
Example:
Input: Java
Output:
JAVA
java
*/
import java.util.Scanner;
public class Email_validator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String string = sc.nextLine();
		System.out.println("Upper case: "+string.toUpperCase());
		System.out.println("Lower case: "+string.toLowerCase());
		sc.close();
	}

}
