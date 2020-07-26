package programs;
import java.util.*;
import java.util.stream.Collectors;
public class PalindromeStrings {
		public static ArrayList<String> Check(ArrayList<String> answer){
			int i=0;
			ArrayList<String> ar = (ArrayList<String>) answer.stream().filter(String->(String.charAt(i)==String.charAt(String.length()-i-1))).collect(Collectors.toList());
			return ar;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no. of elements:");
	int n = sc.nextInt();
	ArrayList<String> ar = new ArrayList<>();
	System.out.println("Enter Strings:");
	sc.nextLine();
	for(int i = 0;i < n;i++){ 
		String str = sc.nextLine();
		ar.add(str);
	}
	System.out.println("The Palindromatic Strings are:");
	ArrayList<String> res = Check(ar);
	for(int i = 0;i < res.size();i++){
		System.out.println(res.get(i));
	}
}
}