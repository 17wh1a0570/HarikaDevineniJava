package programs;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		ArrayList<Integer> array = new ArrayList<>();
		System.out.print("Enter array elements: ");
		scan.nextLine();
		for(int i = 0; i < number; ++i) {
			array.add(scan.nextInt());
		}
		int sumOfElements = array.stream().mapToInt(i -> i.intValue()).sum();
		double avg = sumOfElements / number;
		System.out.println("Average of the numbers " + avg);
	}
}
