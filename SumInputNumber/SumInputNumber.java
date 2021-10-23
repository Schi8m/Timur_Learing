import java.util.Scanner;

public class SumInputNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("the program enters by number, and then sums them up when number = 0 \n sees numbers");
		int number = scan.nextInt();
		int sum = 0;
		while (number != 0){
		 	sum = sum + number;
		 	number = scan.nextInt();
		}
		System.out.print("Sum of your's numbers is " + sum);

	}
}