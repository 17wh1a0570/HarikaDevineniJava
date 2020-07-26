package programs;

import java.util.*;
import java.util.stream.Collectors;
public class StartingAletter {
	public static List<String> start(List<String> checking){
		List<String> res = checking.stream().filter(String-> String.charAt(0) == 'a' && (String.length() == 3) ).collect(Collectors.toList());
		return res;
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		List<String> a = new ArrayList<String>();
		System.out.println("Enter the list ");
		sc.nextLine();
		for(int i=0;i<num;i++) {
			a.add(sc.nextLine());
		}
		System.out.println("The strings are: ");
		List<String> res = start(a);
		res.forEach(str->System.out.println(str));
	}
}