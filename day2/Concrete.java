package week3.day2;

public class Concrete extends Language1 implements Automation {
	
	public void selenium() {
		System.out.println("hello");
		
	}

	public void playwright() {
		System.out.println("hello java");
		
		
	}

	@Override
	public void python() {
		System.out.println("welcome python");
	
	}


public static void main(String[] args)
{

	Concrete obj=new Concrete();
	obj.java();
	
			
}
}