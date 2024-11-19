package AllProgram;
import java.util.Scanner;

public class TablesTask {
// Tables task
	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = obj.nextInt();
		
		for(int i=1; i<10;i++) {
			System.out.println(num+" x "+i+" = "+i*num);
		}
	}
	

}
