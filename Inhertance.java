package AllProgram;
class Coconuttree
{
	void growth()
	{
		System.out.println("He is mother");
		
	}
	
	
}
class Coconutflower extends Coconuttree
{
 void flower()
 {
	 System.out.println("He is a flower");
	 
 }
}
class Coconut extends Coconutflower
{
	void seed()
	{
		System.out.println("He is a Seed");
		
	}
}
class Coconutroot extends Coconutflower
{
	void root()
	{
		System.out.println("His is a root");
		
	}
}
public class Inhertance 
{

	
	public static void main(String[] args)
	
	{
		Coconut obj=new Coconut();
		Coconutroot obj1=new Coconutroot();
		
		obj.growth();
		obj.flower();
		obj.seed();
		obj1.root();
		obj1.growth();
		
	}

}
