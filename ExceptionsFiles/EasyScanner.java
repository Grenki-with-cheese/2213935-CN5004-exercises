import java.util.Scanner;
import java.util.InputMismatchException;

public class EasyScanner
{
	public static int nextInt()
	{
		Scanner sc = new Scanner(System.in);
		try {
			int i = sc.nextInt();
			return i;
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter an integer.");
			sc.nextLine(); // Clear the invalid input
			return nextInt();
		}
	}
	
	public static double nextDouble()
	{
		Scanner sc = new Scanner(System.in);
		try {double d = sc.nextDouble();
		return d;} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a double.");
			sc.nextLine(); // Clear the invalid input
			return nextDouble();
		}
	}
	
	public static String nextString()
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}
	
	public static char nextChar()
	{
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		return c;
	}
}
