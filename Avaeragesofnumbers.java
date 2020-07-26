package programs;

import java.util.*;
public class Avaeragesofnumbers {
	public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.println("Enter num");
				int num = s.nextInt();
				ArrayList<Integer> A = new ArrayList<>();
				System.out.println("Enter elements in list");
				s.nextLine();
				for(int i = 0;i < num;i++){ 
					A.add(s.nextInt());
				}
				int sum = A.stream().mapToInt(i -> i.intValue()).sum();
				double avg=0;
				int b=A.size();
				if(b > 0) {
					 avg = sum / A.size();
				}
				System.out.println("Average of the numbers "+avg);
	}
}