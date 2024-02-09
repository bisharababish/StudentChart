package Random;
    import java.util.Scanner;


public class Recursion {

//factorial recursion
	static int factorial(int n) {
		if (n != 0)
			return n * factorial(n - 1);
		else
			return 1;
	}

//sum 10 number recursion
	static int sum(int n) {
		if (n == 0)
			return n;
		else
			return (n + sum(n - 1));
	}

	public static void main(String[] args) {
		// factorial
		int x = 8;
		int result = factorial(x);
		System.out.println("factorial: " + result);

		// scanner and factorial numbers
		Scanner num = new Scanner(System.in);
		System.out.println("input number");
		int fact = num.nextInt();
		System.out.println("factorial: " + factorial(fact));

		// sum
		int y = 10;
		int resultSum = sum(y);
		System.out.println("Sum: " + resultSum);

		// scanner 10 numbers and sum
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += num.nextInt();
		}
		System.out.println("Sum: " + sum);
	}
}
