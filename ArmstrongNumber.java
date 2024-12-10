package AllProgram;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = obj.nextInt();
		int rem =0;
		int temp=0;
		int mem=num;
		
		while(num>=1) {
			rem=num%10; // we will get remainder
			temp=temp+rem*rem*rem; // In temp we will store temp+ remainder and multiply three times
			num=num/10; // we will get quotient
		}
		if(mem==temp) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("NotAmrstrong");
		}
	}

}
