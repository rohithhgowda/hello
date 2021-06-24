import java.util.Scanner;
public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the integer: ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		if (num % 2 ==0)
			System.out.println("the number is even");
		else 
			System.out.println("odd");
			}

}
