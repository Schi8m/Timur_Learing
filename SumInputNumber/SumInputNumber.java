import java.util.Scanner;

public class SumInputNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int sum = 0;
		while (number != 0){
		 	sum = sum + number;
		 	number = scan.nextInt();
		}
		System.out.print(sum);

	}
}