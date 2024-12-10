package AllProgram;
import java.util.Scanner;
public class NestedSwitchEample {
	
	public static void main(String[] args) {
	//TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String course="java";
		switch(course)
		{
	case "python":
		System.out.println("python is a simple coding language");
		break;
	case "java":
		System.out.println("what version are you using");
		int version=sc.nextInt();
		switch(version)
		{
		case 6:
			System.out.println("That is old version");
			break;
		case 8:
			System.out.println("wow nice version");
			break;
		}
		break;
	case"c++":
		System.out.println(" your select c++ vesrion then what version you need ");
		int version1=sc.nextInt();
		switch(version1)
		{
		
	case 9:
		System.out.println("that is old version");
		break;
	case 10:
		System.out.println("that is between  version");
		break;
	case 11:
		System.out.println("that is new  version");
		break;
		

	}
		break;


			
		}
		
			}
}