import java.util.*;
public class watermelon {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the weight in kg : ");
		int weigth = sc.nextInt();
		if(weigth %2 == 0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
